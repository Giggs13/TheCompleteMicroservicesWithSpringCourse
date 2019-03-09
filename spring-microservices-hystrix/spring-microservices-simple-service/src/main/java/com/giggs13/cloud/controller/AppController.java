package com.giggs13.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AppController {

    @GetMapping("/services")
    public List<String> getServices() {
        return Arrays.asList("Value1", "Value2");
    }
}
