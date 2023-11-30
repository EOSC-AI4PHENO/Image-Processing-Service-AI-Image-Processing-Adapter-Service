package com.siseth.AIProcessing.internal.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.siseth.AIProcessing.internal.api.TaskDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SunriseSunsetResDTO extends TaskDTO {

    @JsonProperty("UTCsunrise")
    private String UTCsunrise;
    @JsonProperty("UTCsunset")
    private String UTCsunset;
}
