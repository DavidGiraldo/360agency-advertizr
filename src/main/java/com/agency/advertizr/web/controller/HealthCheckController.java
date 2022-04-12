package com.agency.advertizr.web.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class HealthCheckController {
    @GetMapping("/health-check")
    @ApiOperation("Comproves if the Advertizr API is running up")
    @ApiResponse(code = 200, message = "OK")
    public String healthCheck(){
        return "The application service is alive!! 💪";
    }
}
