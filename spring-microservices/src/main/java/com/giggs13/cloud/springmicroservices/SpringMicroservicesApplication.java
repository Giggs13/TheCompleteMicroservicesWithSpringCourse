package com.giggs13.cloud.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ImportResource("/simple-context.xml")
public class SpringMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesApplication.class, args);
    }

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public ServletRegistrationBean registration() {
        ServletRegistrationBean registration =
                new ServletRegistrationBean(dispatcherServlet(), "/servlet/*");
        registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME);

        return registration;
    }
}
