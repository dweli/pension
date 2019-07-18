package com.kedi.homeservicecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *
 */
@EnableFeignClients(basePackages = "com.kedi.homeservicecenter")
@ComponentScan("com.kedi.homeservicecenter")
@EnableEurekaClient
@SpringBootApplication
public class HomeServiceCenter 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(HomeServiceCenter.class, args);
    }
}
