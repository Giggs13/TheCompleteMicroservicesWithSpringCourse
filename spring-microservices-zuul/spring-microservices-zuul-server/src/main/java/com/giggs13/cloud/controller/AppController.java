package com.giggs13.cloud.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class AppController {

    @Setter(onMethod_ = {@Autowired})
    WebClient.Builder webClientBuilder;

    @GetMapping("/start-client")
    public String startClient() {
        return webClientBuilder.build()
                .get()
                .uri("http://simple-service/execute")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
