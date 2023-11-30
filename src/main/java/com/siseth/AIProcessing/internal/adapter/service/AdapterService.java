package com.siseth.AIProcessing.internal.adapter.service;

import com.siseth.AIProcessing.internal.api.TaskDTO;
import com.siseth.AIProcessing.internal.api.request.AutomaticRoisReqDTO;
import com.siseth.AIProcessing.internal.api.request.CustomRoisReqDTO;
import com.siseth.AIProcessing.internal.api.request.ImageWellExposedReqDTO;
import com.siseth.AIProcessing.internal.api.request.SunriseSunsetReqDTO;
import com.siseth.AIProcessing.internal.api.response.SunriseSunsetResDTO;
import com.siseth.AIProcessing.internal.feign.AI.AiFeign;
import com.siseth.AIProcessing.internal.feign.AI.dto.AutomaticRoisFeignDTO;
import com.siseth.AIProcessing.internal.feign.AI.dto.CustomRoisFeignDTO;
import com.siseth.AIProcessing.internal.feign.AI.dto.ImageWellExposedFeignDTO;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
@RequiredArgsConstructor
public class AdapterService {

    private final AiFeign aiFeign;

    @SneakyThrows
    public TaskDTO getSunriseSunset(SunriseSunsetReqDTO dto) {
        return aiFeign.getSunriseSunset(dto);
    }

    @SneakyThrows
    public SunriseSunsetResDTO getSunriseSunsetResult(String path) {
        return aiFeign.getSunriseSunsetResult(path);
    }

    @SneakyThrows
    public Object isImageWellExposed(ImageWellExposedReqDTO dto) {
        ImageWellExposedFeignDTO imageWellExposedFeignDTO = new ImageWellExposedFeignDTO(
                Base64.getEncoder().encodeToString(dto.getImg()),
                dto.getName(),
                dto.getLat(),
                dto.getLon(),
                dto.getCreatedAt()
        );

        return aiFeign.isImageWellExposed(imageWellExposedFeignDTO);
    }

    public Object isImageWellExposedResult(String taskId) {
        return aiFeign.isImageWellExposedResult(taskId);
    }

    public Object appleAutomaticRoisWithIndicators(CustomRoisReqDTO dto) {
        CustomRoisFeignDTO customRoisFeignDTO = new CustomRoisFeignDTO(dto);
        return aiFeign.appleAutomaticRoisWithIndicators(customRoisFeignDTO);
    }

    public Object appleAutomaticRoisWithIndicatorsResult(String taskId) {
        return aiFeign.appleAutomaticRoisWithIndicatorsResult(taskId);
    }



    public Object lindenAutomaticRoisWithIndicators(AutomaticRoisReqDTO dto) {
        AutomaticRoisFeignDTO automaticRoisFeignDTO = new AutomaticRoisFeignDTO(dto);
        return aiFeign.lindenAutomaticRoisWithIndicators(automaticRoisFeignDTO);
    }

    public Object lindenAutomaticRoisWithIndicatorsResult(String taskId) {
        return aiFeign.lindenAutomaticRoisWithIndicatorsResult(taskId);
    }



    public Object lindenWithIndicators(CustomRoisReqDTO dto) {
        CustomRoisFeignDTO customRoisFeignDTO = new CustomRoisFeignDTO(dto);
        return aiFeign.lindensWithIndicators(customRoisFeignDTO);
    }

    public Object lindenWithIndicatorsResult(String taskId) {
        return aiFeign.lindensWithIndicatorsResult(taskId);
    }



    public Boolean deleteTask(String taskId) {
        return aiFeign.delete_task_from_redis(taskId).getStatusFlag();
    }

}
