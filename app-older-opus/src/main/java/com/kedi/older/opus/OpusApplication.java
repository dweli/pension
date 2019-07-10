package com.kedi.older.opus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OpusApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpusApplication.class,args);
    }
}
