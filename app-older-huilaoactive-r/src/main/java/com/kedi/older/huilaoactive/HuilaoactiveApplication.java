package com.kedi.older.huilaoactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HuilaoactiveApplication {
    public static void main(String[] args) {
        SpringApplication.run(HuilaoactiveApplication.class,args);
    }
}
