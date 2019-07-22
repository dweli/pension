package com.kedi.older;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 
* @Description: 
* @author: dw 
* @date: 2019 2019年7月22日 下午1:22:13
 */
@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
public class OldApplication {
    public static void main(String[] args) {
        SpringApplication.run(OldApplication.class,args);
    }
    /**
     * 上传文件配置
     * @return
     */
@Bean
public MultipartConfigElement multipartConfigElement() {
    MultipartConfigFactory factory = new MultipartConfigFactory();
    factory.setMaxFileSize("100MB"); //KB,MB
    factory.setMaxRequestSize("100MB");
    return factory.createMultipartConfig();
}
  
}
