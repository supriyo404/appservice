package com.azure.supriyo.controller;

import com.azure.supriyo.model.ApplicationStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AppServiceController {

    public static final Logger logger = LoggerFactory.getLogger(AppServiceController.class);

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/status")
    public ResponseEntity<ApplicationStatus> status(){
        logger.info("Controller method called.");
        return ResponseEntity.ok(new ApplicationStatus(appName,200));
    }

}
