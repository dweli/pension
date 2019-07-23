package com.kedi.productcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
* 方法实现说明   商品中心 启动类
* @author      ytw
*@param
* @return      
* @exception   
* @date        2019/7/22 16:17
*/
@ComponentScan("com.kedi")
@EnableEurekaClient
@SpringBootApplication
public class ProductCenter {
    public static void main( String[] args ) {
        SpringApplication.run(ProductCenter.class, args);
    }
}
