package com.giggs13.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class AppController {

    @Setter(onMethod_ = {@Autowired})
    private WebClient.Builder webClientBuilder;

    @GetMapping("/start-client")
    @HystrixCommand(
            fallbackMethod = "startClientFallback",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
            })
    @SuppressWarnings("unchecked")
    public List<String> startClient(@RequestParam long time) {
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8888/services")
                .retrieve()
                .bodyToMono(List.class)
                .block();
    }

    private List<String> startClientFallback(long time) {
        return Arrays.asList("Default1", "Default2");
    }
}
