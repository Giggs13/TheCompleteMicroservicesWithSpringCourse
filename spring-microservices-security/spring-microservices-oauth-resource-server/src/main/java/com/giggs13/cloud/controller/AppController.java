package com.giggs13.cloud.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AppController {

    @GetMapping("/resource/endpoint")
    @PreAuthorize("hasRole('ADMIN')")
    public String endpoint(Principal principal) {
        return "Welcome, " + principal.getName() + ". This message is protected by Resource Server";
    }
}
