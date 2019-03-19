package com.giggs13.cloud.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class AppController {

    @Setter(onMethod_ = {@Autowired})
    OAuth2RestTemplate oAuth2RestTemplate;

    @GetMapping("/execute")
    public String execute(final Authentication authentication)
            throws URISyntaxException {
        User user = (User) authentication.getPrincipal();
        URI uri = new URI("http://localhost:7070/resource/endpoint");
        RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET, uri);
        AccessTokenRequest accessTokenRequest = oAuth2RestTemplate.getOAuth2ClientContext().getAccessTokenRequest();
        accessTokenRequest.set("username", user.getUsername());
        accessTokenRequest.set("password", user.getPassword());

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        return oAuth2RestTemplate.exchange(request, String.class)
                .getBody();
    }
}
