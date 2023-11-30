package com.siseth.AIProcessing.internal.feign.AI.dto;

import com.siseth.AIProcessing.internal.api.request.AutomaticRoisReqDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Base64;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AutomaticRoisFeignDTO {

    private String imageBase64;

    private String filename;

    public AutomaticRoisFeignDTO(AutomaticRoisReqDTO dto) {
        this.imageBase64 = Base64.getEncoder().encodeToString(dto.getImg());
        this.filename = dto.getName();
    }
}
