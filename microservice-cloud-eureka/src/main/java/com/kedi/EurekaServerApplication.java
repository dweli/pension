package com.kedi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerApplication
 * @Description
 * @Author ytw
 * @Date 2019/7/1  17:35
 * Version 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {

        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
