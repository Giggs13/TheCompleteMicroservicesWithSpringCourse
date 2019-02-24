package com.giggs13.cloud.springmicroservices.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {

    @Setter(onMethod_ = {@Autowired, @Resource(name = "cats")})
    private List<String> cats;
    @Setter(onMethod_ = {@Autowired, @Resource(name = "circus")})
    private List<String> circus;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/cats")
    public String cats() {
        return String.join(", ", cats);
    }

    @GetMapping("/circus")
    public String circus() {
        return String.join(", ", circus);
    }
}
