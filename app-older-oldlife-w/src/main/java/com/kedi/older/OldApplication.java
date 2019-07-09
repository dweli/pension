package com.kedi.older;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OldApplication {
    public static void main(String[] args) {
        SpringApplication.run(OldApplication.class,args);
    }
}
