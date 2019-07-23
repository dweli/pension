package com.kedi.usercenter.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
* @Description:    pagehelper 配置
* @Author:         ytw
* @CreateDate:     2019/7/22 14:37
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

@Configuration
public class MyBatisConfig {
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper=new PageHelper();
        Properties properties = new Properties();
        //设置为true 时 会将rowbounds第一个参数offset当成pagenum页码使用
        properties.setProperty("offsetAsPageNum","true");
        //设置为true时 会将rowbounds分页会进行count查询
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        pageHelper.setProperties(properties);
        return  pageHelper;
    }
}
