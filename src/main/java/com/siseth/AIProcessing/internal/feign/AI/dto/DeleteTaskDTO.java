package com.siseth.AIProcessing.internal.feign.AI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteTaskDTO {

    private Boolean statusFlag;
}
