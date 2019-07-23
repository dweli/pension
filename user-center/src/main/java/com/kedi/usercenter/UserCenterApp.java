package com.kedi.usercenter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



/**
* @Description:    个人中心启动类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:56
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@EnableEurekaClient
@SpringBootApplication
public class UserCenterApp {
    public static void main( String[] args ) {
        SpringApplication.run(UserCenterApp.class, args);
    }
}
