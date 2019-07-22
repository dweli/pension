package com.kedi.homeservicecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * 
 *
 * @ClassName	HomeServiceCenter
 * @author: 	陈辽逊
 * @date: 		2019/7/20
 *
 */
@EnableFeignClients(basePackages = "com.kedi")
@ComponentScan("com.kedi")
@EnableEurekaClient
@SpringBootApplication
public class HomeServiceCenter 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(HomeServiceCenter.class, args);
    }
}
