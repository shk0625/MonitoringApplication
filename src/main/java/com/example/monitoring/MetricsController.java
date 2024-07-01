package com.example.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    @GetMapping("/endpoint1")
    public String endPoint1(){
        return "Metrics for endPoint1";
    }

    @GetMapping("/endpoint2")
    public String endPoint2(){
        return "Metrics for endPoint2";
    }
}
