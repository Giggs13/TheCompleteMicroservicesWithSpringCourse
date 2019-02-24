package com.giggs13.cloud.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/simple-context.xml")
public class SpringMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesApplication.class, args);
    }
}
