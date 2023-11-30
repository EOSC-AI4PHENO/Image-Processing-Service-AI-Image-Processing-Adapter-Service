package com.siseth.AIProcessing.internal.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImageWellExposedReqDTO {

    private byte[] img;
    private String name;
    private Double lat;
    private Double lon;
    private String createdAt;
}
