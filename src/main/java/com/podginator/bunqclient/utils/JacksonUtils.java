package com.podginator.bunqclient.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Field;
import java.util.List;
import org.apache.commons.lang3.reflect.FieldUtils;

public class JacksonUtils {
  public static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  public static <T> String writeValueAsString(final T value) {
    try {
      return objectMapper.writeValueAsString(value);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  // Todo: None reflection version of this mess.
  public static <T> T mergeAll(List<T> all) {
    return all.stream()
        .skip(1)
        .reduce(
            all.get(0),
            (obj1, obj2) -> {
              try {
                Field[] allFields = obj1.getClass().getDeclaredFields();
                for (Field field : allFields) {
                  if (FieldUtils.readField(field, obj1, true) == null
                      && FieldUtils.readField(field, obj2, true) != null) {
                    FieldUtils.writeField(
                        obj1, field.getName(), FieldUtils.readField(field, obj2, true), true);
                  }
                }

                return obj1;
              } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
              }
            });
  }
}
