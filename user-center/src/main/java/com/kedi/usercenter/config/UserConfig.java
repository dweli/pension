package com.kedi.usercenter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/**
* 方法实现说明  properties 属性配置类
* @author      ytw
*@param
* @return
* @exception   
* @date        2019/7/22 14:38
*/
@Configuration
@PropertySource(value="classpath:application.properties")
public class UserConfig {
    @Value("user.KEY_PREFIX")
    private String keyPrefix;

    public String getkeyPrefix() {
        return keyPrefix;
    }

    public void setkeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }
}
