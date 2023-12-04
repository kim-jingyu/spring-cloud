package com.microservices.limitsservice.controller;

import com.microservices.limitsservice.config.Configuration;
import com.microservices.limitsservice.domain.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {
    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return new Limits(1, 1000);
    }
}
