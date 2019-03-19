package com.giggs13.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@EnableOAuth2Client
public class SpringMicroservicesOauthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesOauthClientApplication.class, args);
    }
}
