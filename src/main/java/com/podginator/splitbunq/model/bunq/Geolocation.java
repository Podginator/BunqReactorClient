package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Geolocation {

  /** The latitude for a geolocation restriction. */
  @JsonProperty("latitude")
  private BigDecimal latitude;

  /** The longitude for a geolocation restriction. */
  @JsonProperty("longitude")
  private BigDecimal longitude;

  /** The altitude for a geolocation restriction. */
  @JsonProperty("altitude")
  private BigDecimal altitude;

  /** The radius for a geolocation restriction. */
  @JsonProperty("radius")
  private BigDecimal radius;

  /** The latitude for a geolocation restriction. */
  @JsonProperty("latitude_field_for_request")
  private String latitudeFieldForRequest;

  /** The longitude for a geolocation restriction. */
  @JsonProperty("longitude_field_for_request")
  private String longitudeFieldForRequest;

  /** The altitude for a geolocation restriction. */
  @JsonProperty("altitude_field_for_request")
  private String altitudeFieldForRequest;

  /** The radius for a geolocation restriction. */
  @JsonProperty("radius_field_for_request")
  private String radiusFieldForRequest;
}
