package com.kedi.benefitwelfare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *
 */
@EnableFeignClients(basePackages = "com.kedi")
@ComponentScan("com.kedi")
@EnableEurekaClient
@SpringBootApplication
public class BenefitElderlyWealfare 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(BenefitElderlyWealfare.class, args);
    }
}
