package com.pavelkostal.shdatabase.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@CrossOrigin({"http://localhost:4200", "http://localhost:8081", "https://superhero-api-frontend-547e763e62a9.herokuapp.com", "http://superheroapi.pavelkostal.com"})
public class HealthController {

    private static final long START_TIME = System.currentTimeMillis();

    @GetMapping("/health")
    public Map<String, Object> health() {
        long uptimeSeconds = (System.currentTimeMillis() - START_TIME) / 1000;

        long days    = uptimeSeconds / 86400;
        long hours   = (uptimeSeconds % 86400) / 3600;
        long minutes = (uptimeSeconds % 3600) / 60;
        long seconds = uptimeSeconds % 60;

        String formatted = String.format("%dd %dh %dm %ds", days, hours, minutes, seconds);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status", "UP");
        response.put("uptimeSeconds", uptimeSeconds);
        response.put("uptime", formatted);
        return response;
    }
}
