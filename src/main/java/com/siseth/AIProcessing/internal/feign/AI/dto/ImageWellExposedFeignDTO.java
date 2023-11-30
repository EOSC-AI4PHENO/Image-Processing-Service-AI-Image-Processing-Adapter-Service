package com.siseth.AIProcessing.internal.feign.AI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ImageWellExposedFeignDTO {

    private String imageBase64;

    private String filename;

    private Double lat;

    private Double lon;

    @JsonProperty("UTCdate")
    private String UTCdate;

}
