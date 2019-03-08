package com.giggs13.cloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Setter(onMethod_ = {@Autowired})
    private EurekaClient eurekaClient;

    @GetMapping("/service-info")
    public String getServiceInfo() {
        InstanceInfo instanceInfo =
                eurekaClient.getNextServerFromEureka("eureka-client-1", false);

        return instanceInfo.getHomePageUrl() + " - from eureka-client-2";
    }
}
