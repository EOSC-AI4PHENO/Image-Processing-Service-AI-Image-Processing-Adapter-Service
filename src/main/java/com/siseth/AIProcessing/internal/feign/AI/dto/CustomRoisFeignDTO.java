package com.siseth.AIProcessing.internal.feign.AI.dto;

import com.siseth.AIProcessing.internal.api.request.AutomaticRoisReqDTO;
import com.siseth.AIProcessing.internal.api.request.CustomRoisReqDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Base64;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomRoisFeignDTO{

    private String jsonBase64ImageROIs;

    private String imageBase64;

    private String filename;

    public CustomRoisFeignDTO(CustomRoisReqDTO dto) {
        this.filename = dto.getName();
        this.imageBase64 = Base64.getEncoder().encodeToString(dto.getImg());
        if (dto.getRoi() != null) {
            this.jsonBase64ImageROIs = Base64.getEncoder().encodeToString(dto.getRoi());
        }
    }
}
