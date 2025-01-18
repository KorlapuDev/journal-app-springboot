package com.abhi.journalapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public boolean heclthCheck(){
        return true;
    }

    @GetMapping("/status")
    public boolean heclthCheckStatus(){
        return true;
    }


}
