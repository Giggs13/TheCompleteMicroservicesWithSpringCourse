package com.giggs13.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class LibraryEdgeZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryEdgeZuulApplication.class, args);
    }
}
