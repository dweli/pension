package com.kedi.aliyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @Description:    ali服务启动类
* @Author:         ytw
* @CreateDate:     2019/7/22 15:26
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@ServletComponentScan
@EnableEurekaClient
@SpringBootApplication
public class ALiYunApp {
    public static void main( String[] args ) {
        SpringApplication.run(ALiYunApp.class, args);
    }
}
