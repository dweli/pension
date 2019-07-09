package com.kedi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerConfig {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfig.class, args);
    }
}
