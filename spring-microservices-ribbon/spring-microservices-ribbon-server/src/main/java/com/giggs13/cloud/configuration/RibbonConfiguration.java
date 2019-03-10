package com.giggs13.cloud.configuration;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {

    @Bean
    public IPing ping() {
        return new PingUrl();
    }

    @Bean
    public IRule rule() {
        return new AvailabilityFilteringRule();
    }
}
