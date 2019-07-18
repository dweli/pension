package com.kedi.older;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
public class OldApplication {
    public static void main(String[] args) {
        SpringApplication.run(OldApplication.class,args);
    }
}
