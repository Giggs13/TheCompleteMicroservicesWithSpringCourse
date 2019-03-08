package com.giggs13.cloud.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class AppController {

    @Setter(onMethod_ = {@Autowired})
    private WebClient.Builder webClientBuilder;

    @GetMapping("/execute")
    public String execute() {
        return webClientBuilder.build()
                .get()
                .uri("http://EUREKA-CLIENT-2/service-info")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
