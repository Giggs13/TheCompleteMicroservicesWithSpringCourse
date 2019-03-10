package com.giggs13.cloud.configuration;

import com.giggs13.cloud.filter.CustomZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfiguration {

    @Bean
    public CustomZuulFilter filter() {
        return new CustomZuulFilter();
    }
}
