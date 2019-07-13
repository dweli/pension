package com.older.welfare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WelfareApplication {
    public static void main(String[] args) {
        SpringApplication.run(WelfareApplication.class,args);
    }
}
