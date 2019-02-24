package com.giggs13.cloud.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesApplication.class, args);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
