package com.giggs13.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMicroservicesEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesEurekaClient2Application.class, args);
    }
}
