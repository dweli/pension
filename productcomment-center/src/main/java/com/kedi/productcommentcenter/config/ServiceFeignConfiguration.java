package com.kedi.productcommentcenter.config;


import feign.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @Description:    feign配置类
* @Author:         ytw
* @CreateDate:     2019/7/12 10:34
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
