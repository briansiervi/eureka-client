package com.springcloudnetflix.demo;

import com.netflix.discovery.EurekaClient;
import com.springcloudnetflix.demo.resource.GreetingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class DemoApplication implements GreetingController {
	@Autowired
    @Lazy
    private EurekaClient eurekaClient;
 
    @Value("${spring.application.name}")
    private String appName;
 
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
 
    @Override
    public String greeting() {
        return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }
}
