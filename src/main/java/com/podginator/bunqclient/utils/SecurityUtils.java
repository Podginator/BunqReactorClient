package com.podginator.bunqclient.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.xml.bind.DatatypeConverter;

public class SecurityUtils {

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  private static final String NEWLINE = "\n";
  private static final String PUBLIC_KEY_START = "-----BEGIN PUBLIC KEY-----\n";
  private static final String PUBLIC_KEY_END = "\n-----END PUBLIC KEY-----\n";
  private static final String PUBLIC_KEY_FORMAT = PUBLIC_KEY_START + "%s" + PUBLIC_KEY_END;
  private static final int KEY_ENCODED_LINE_LENGTH = 64;
  private static final String KEY_PAIR_GENERATOR_ALGORITHM = "RSA";
  private static final int KEY_PAIR_GENERATOR_KEY_SIZE = 2048;

  public static KeyPair generateKeyPair() {
    try {
      KeyPairGenerator generator = KeyPairGenerator.getInstance(KEY_PAIR_GENERATOR_ALGORITHM);
      generator.initialize(KEY_PAIR_GENERATOR_KEY_SIZE);

      return generator.generateKeyPair();
    } catch (NoSuchAlgorithmException exception) {
      throw new RuntimeException(exception);
    }
  }

  public static <T> String encrypted(final PublicKey key, final T data) {
    try {
      Cipher encryptCipher = Cipher.getInstance("RSA");
      encryptCipher.init(Cipher.ENCRYPT_MODE, key);

      final byte[] encryptedData =
          OBJECT_MAPPER.writeValueAsString(data).getBytes(StandardCharsets.UTF_8);
      byte[] encryptedMessageBytes = encryptCipher.doFinal(encryptedData);

      return Base64.getEncoder().encodeToString(encryptedMessageBytes);
    } catch (Exception e) {
      throw new RuntimeException("Cannot Encrypt data for BUNQ");
    }
  }

  public static PublicKey generatePublicKey(final String publicKey) {
    String pubKeyPEM =
        publicKey
            .replace("-----BEGIN PUBLIC KEY-----\n", "")
            .replace("-----END PUBLIC KEY-----", "")
            .replace("\n", "");

    byte[] encodedPublicKey = Base64.getDecoder().decode(pubKeyPEM);

    X509EncodedKeySpec spec = new X509EncodedKeySpec(encodedPublicKey);
    KeyFactory kf = null;
    try {
      kf = KeyFactory.getInstance("RSA");

      return kf.generatePublic(spec);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static String getPublicKeyFormattedString(PublicKey publicKey) {
    byte[] encodedPublicKey = publicKey.getEncoded();
    String publicKeyString = DatatypeConverter.printBase64Binary(encodedPublicKey);

    List<String> encodedKeyLines = getChunksFromString(publicKeyString, KEY_ENCODED_LINE_LENGTH);
    publicKeyString = String.join(NEWLINE, encodedKeyLines);

    return String.format(PUBLIC_KEY_FORMAT, publicKeyString);
  }

  public static List<String> getChunksFromString(String stringToSplit, int chunkSize) {
    List<String> chunkList = new ArrayList<>();

    int chunkAmount = (int) Math.ceil(stringToSplit.length() / chunkSize);
    for (int chunk = 0; chunk <= chunkAmount; chunk++) {
      int startIndex = chunk * chunkSize;
      int endIndex = startIndex + chunkSize;
      endIndex = Math.min(stringToSplit.length(), endIndex);

      chunkList.add(stringToSplit.substring(startIndex, endIndex));
    }

    return chunkList;
  }

  public static boolean validateEquality(String expected, String encrypted, PublicKey publicKey) {
    try {
      var signature = Signature.getInstance("SHA256withRSA");

      signature.initVerify(publicKey);
      signature.update(expected.getBytes(StandardCharsets.UTF_8));

      return signature.verify(Base64.getDecoder().decode(encrypted));
    } catch (Exception e) {
      // Log Error
      return false;
    }
  }
}
