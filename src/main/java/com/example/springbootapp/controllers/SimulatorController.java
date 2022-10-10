package com.example.springbootapp.controllers;

import com.example.springbootapp.dtos.WelcomeMessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/simulators")
@Slf4j
public class SimulatorController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public WelcomeMessageDTO simulate() {
        log.info("Simulated processing!");
        return WelcomeMessageDTO.builder()
                .message("Simulated!")
                .build();
    }

}
