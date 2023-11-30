package com.siseth.AIProcessing.internal.feign.AI;

import com.siseth.AIProcessing.internal.api.TaskDTO;
import com.siseth.AIProcessing.internal.api.request.SunriseSunsetReqDTO;
import com.siseth.AIProcessing.internal.api.response.SunriseSunsetResDTO;
import com.siseth.AIProcessing.internal.feign.AI.dto.AutomaticRoisFeignDTO;
import com.siseth.AIProcessing.internal.feign.AI.dto.CustomRoisFeignDTO;
import com.siseth.AIProcessing.internal.feign.AI.dto.DeleteTaskDTO;
import com.siseth.AIProcessing.internal.feign.AI.dto.ImageWellExposedFeignDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "${app.fast-api-temp}", value = "fast-api" )
public interface AiFeign {

    @PostMapping(value = "/ImageWellExposedModel/get_sunrise_sunset")
    TaskDTO getSunriseSunset(@RequestBody SunriseSunsetReqDTO dto);


    @GetMapping(value = "/ImageWellExposedModel/get_sunrise_sunset_result/{path}")
    SunriseSunsetResDTO getSunriseSunsetResult(@PathVariable String path);



    @PostMapping("/ImageWellExposedModel/is_Image_WellExposedByHisto")
    Object isImageWellExposed(@RequestBody ImageWellExposedFeignDTO dto);

    @GetMapping("/ImageWellExposedModel/is_Image_WellExposedByHisto_result/{task_id}")
    Object isImageWellExposedResult(@PathVariable String task_id);




    @GetMapping("/Redis/delete_task_from_redis/{task_id}")
    DeleteTaskDTO delete_task_from_redis(@PathVariable String task_id);


    @PostMapping("/AutomaticAppleSegmentationDetectron2Model/get_apple_automatic_rois_with_indicators_Detectron2")
    Object appleAutomaticRoisWithIndicators(@RequestBody CustomRoisFeignDTO dto);


    @GetMapping("/AutomaticAppleSegmentationDetectron2Model/get_apple_automatic_rois_with_indicators_Detectron2_result/{path}")
    Object appleAutomaticRoisWithIndicatorsResult(@PathVariable String path);


    @PostMapping("/AutomaticLindenSegmentationModel/get_linden_automatic_rois_with_indicators")
    Object lindenAutomaticRoisWithIndicators(@RequestBody AutomaticRoisFeignDTO dto);


    @GetMapping("/AutomaticLindenSegmentationModel/get_linden_automatic_rois_with_indicators_result/{path}")
    Object lindenAutomaticRoisWithIndicatorsResult(@PathVariable String path);



    @PostMapping("/LindenClassificationModel/get_classification_linden_with_indicators")
    Object lindensWithIndicators(@RequestBody CustomRoisFeignDTO dto);

    @GetMapping("/LindenClassificationModel/get_classification_linden_with_indicators_result/{path}")
    Object lindensWithIndicatorsResult(@PathVariable String path);

}
