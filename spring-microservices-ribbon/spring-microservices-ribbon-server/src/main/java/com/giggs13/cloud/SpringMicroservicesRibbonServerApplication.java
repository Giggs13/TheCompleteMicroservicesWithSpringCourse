package com.giggs13.cloud;

import com.giggs13.cloud.configuration.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "simple-service", configuration = RibbonConfiguration.class)
public class SpringMicroservicesRibbonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesRibbonServerApplication.class, args);
    }
}
