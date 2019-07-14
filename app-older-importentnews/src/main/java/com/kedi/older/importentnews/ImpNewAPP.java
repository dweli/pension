package com.kedi.older.importentnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ImpNewAPP {
    public static void main(String[] args) {
        SpringApplication.run(ImpNewAPP.class,args);
    }
}
