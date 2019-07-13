package com.kedi.importantnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:    启动加载类
 * @Author:         ytw
 * @CreateDate:     2019/7/12 9:41
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@EnableFeignClients(basePackages = "com.kedi")
@ComponentScan("com.kedi")
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class ImportantnewsAPP {
    public static void main( String[] args ) {
        SpringApplication.run(ImportantnewsAPP.class, args);
    }
}
