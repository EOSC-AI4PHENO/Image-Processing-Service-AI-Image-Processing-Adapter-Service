package com.siseth.AIProcessing.internal.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SunriseSunsetReqDTO {

    private Long lat;
    private Long lon;

    @JsonProperty("UTCdate")
    private String UTCdate;
}
