package com.siseth.AIProcessing.internal.adapter.controller;

import com.siseth.AIProcessing.internal.adapter.service.AdapterService;
import com.siseth.AIProcessing.internal.api.TaskDTO;
import com.siseth.AIProcessing.internal.api.request.AutomaticRoisReqDTO;
import com.siseth.AIProcessing.internal.api.request.CustomRoisReqDTO;
import com.siseth.AIProcessing.internal.api.request.ImageWellExposedReqDTO;
import com.siseth.AIProcessing.internal.api.request.SunriseSunsetReqDTO;
import com.siseth.AIProcessing.internal.api.response.SunriseSunsetResDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/image-processing/ai-adapter")
@Tag(name = "Image processing adapter service", description = "Endpoints to manage image processing")
public class AdapterController {

    private final AdapterService service;
    @PostMapping("/getSunriseSunset")
    public ResponseEntity<TaskDTO> getSunriseSunset(@RequestBody SunriseSunsetReqDTO dto) {
        return ResponseEntity.ok(service.getSunriseSunset(dto));
    }

    @GetMapping("/getSunriseSunsetResult/{path}")
    public ResponseEntity<SunriseSunsetResDTO> getSunriseSunsetResult(@PathVariable String path) {
        return ResponseEntity.ok(service.getSunriseSunsetResult(path));
    }

    @PostMapping("/isImageWellExposed")
    public ResponseEntity<Object> isImageWellExposed(@RequestBody ImageWellExposedReqDTO dto) {
        return ResponseEntity.ok(service.isImageWellExposed(dto));

    }

    @GetMapping("/isImageWellExposedResult/{taskId}")
    public ResponseEntity<Object> isImageWellExposedResult(@PathVariable String taskId) {
        return ResponseEntity.ok(service.isImageWellExposedResult(taskId));
    }

    @GetMapping("/deleteTask/{taskId}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable String taskId) {
        return ResponseEntity.ok(service.deleteTask(taskId));
    }

    @PostMapping("/appleAutomaticRoisWithIndicators")
    public ResponseEntity<Object> appleAutomaticRoisWithIndicators(@RequestBody CustomRoisReqDTO dto) {
        return ResponseEntity.ok(service.appleAutomaticRoisWithIndicators(dto));

    }

    @GetMapping("/appleAutomaticRoisWithIndicatorsResult/{taskId}")
    public ResponseEntity<Object> appleAutomaticRoisWithIndicatorsResult(@PathVariable String taskId) {
        return ResponseEntity.ok(service.appleAutomaticRoisWithIndicatorsResult(taskId));
    }


    @PostMapping("/lindenAutomaticRoisWithIndicators")
    public ResponseEntity<Object> lindenAutomaticRoisWithIndicators(@RequestBody AutomaticRoisReqDTO dto) {
        return ResponseEntity.ok(service.lindenAutomaticRoisWithIndicators(dto));

    }

    @GetMapping("/lindenAutomaticRoisWithIndicatorsResult/{taskId}")
    public ResponseEntity<Object> lindenAutomaticRoisWithIndicatorsResult(@PathVariable String taskId) {
        return ResponseEntity.ok(service.lindenAutomaticRoisWithIndicatorsResult(taskId));
    }




    @PostMapping("/lindenWithIndicators")
    public ResponseEntity<Object> lindenWithIndicators(@RequestBody CustomRoisReqDTO dto) {
        return ResponseEntity.ok(service.lindenWithIndicators(dto));
    }

    @GetMapping("/lindenWithIndicatorsResult/{taskId}")
    public ResponseEntity<Object> lindenWithIndicatorsResult(@PathVariable String taskId) {
        return ResponseEntity.ok(service.lindenWithIndicatorsResult(taskId));
    }

}
