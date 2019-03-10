package com.giggs13.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/execute")
    public String execute() {
        return "Executed...";
    }
}
