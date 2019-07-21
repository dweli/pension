package com.kedi.older;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
public class OldApplication {
    public static void main(String[] args) {
        SpringApplication.run(OldApplication.class,args);
    }
    /**
     * 文件上传配置
     * @return
     */
@Bean
public MultipartConfigElement multipartConfigElement() {
    MultipartConfigFactory factory = new MultipartConfigFactory();
    //文件最大
    factory.setMaxFileSize("100MB"); //KB,MB
    /// 设置总上传数据总大小
    factory.setMaxRequestSize("100MB");
    return factory.createMultipartConfig();
}
  
}
