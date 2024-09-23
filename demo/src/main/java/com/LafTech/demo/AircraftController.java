package com.LafTech.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> getAircraftStatus() {
        String pythonApiUrl = "http://127.0.0.1:5000/status";
        Map<String, Object> status = restTemplate.getForObject(pythonApiUrl, Map.class);
        return ResponseEntity.ok(status);
    }
}

