package com.kedi.bilanshan.config;


import feign.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @Description:    设置超时连接
* @Author:         ytw
* @CreateDate:     2019/7/12 9:37
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Configuration
public class ServiceFeignConfiguration {
    @Value("${service.feign.connectTimeout:6000}")
    private int connectTimeout;

    @Value("${service.feign.readTimeOut:6000}")
    private int readTimeout;

    @Bean
    public Request.Options options() {
        return new Request.Options(connectTimeout, readTimeout);
    }

}