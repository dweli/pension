package com.kedi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName zuulServerApplication
 * @Description
 * @Author ytw
 * @Date 2019/7/2  15:31
 * Version 1.0
 **/
@EnableZuulProxy
@SpringBootApplication
public class zuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(zuulServerApplication.class, args);
    }
}
