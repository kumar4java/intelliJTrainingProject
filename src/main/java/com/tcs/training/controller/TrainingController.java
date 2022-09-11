package com.tcs.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

    @GetMapping
    public String getDetails() {
        return "Hello";
    }
}
