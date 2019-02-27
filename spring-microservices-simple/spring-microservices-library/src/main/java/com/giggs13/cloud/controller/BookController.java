package com.giggs13.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/search")
    public String getByTitle(@RequestParam String title) {
        WebClient webClient = WebClient.create("http://localhost:9991/books/search/title?title=" + title);
        return webClient.get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
