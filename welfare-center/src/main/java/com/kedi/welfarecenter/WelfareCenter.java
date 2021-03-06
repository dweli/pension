package com.kedi.welfarecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
* @Description: 
* @author: dw 
* @date: 2019 2019年7月22日 上午9:58:04
 */

@EnableFeignClients(basePackages = "com.kedi")
@ComponentScan("com.kedi")
@EnableEurekaClient
@SpringBootApplication
public class WelfareCenter 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(WelfareCenter.class, args);
    }
}
