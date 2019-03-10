package com.giggs13.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/")
    public String getStatus() {
        return "Up";
    }

    @GetMapping("/execute")
    public String execute() {
        return "Hello from the port " + port;
    }
}
