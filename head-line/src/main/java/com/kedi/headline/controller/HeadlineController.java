package com.kedi.headline.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.headline.service.HeadlineFeignService;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 每日头条业务层接口
 * @Description
 * @Author clx
 * @Date 2019/7/11  15:31
 * Version 1.0
 **/
@RestController
public class HeadlineController {
    @Autowired
    private HeadlineFeignService headlineFeignService;

    /**
     * 
     * @Description  获取国内新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "/homenews/getHomeNews")
    public List<Map> getHomeNews( ) {
    	
        return headlineFeignService.getHomeNews();
    }
    /**
     * 
     * @Description  获取国际新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "/internationnalnews/getInternationnalNews")
    public List<Map> getInternationnalNews( ) {
    	
    	return headlineFeignService.getInternationnalNews();
    }
    /**
     * 
     * @Description  获取省内新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "/provincialnews/getProvincialNews")
    public List<Map> getProvincialNews( ) {
    	
    	return headlineFeignService.getProvincialNews();
    }
    /**
     * 
     * @Description  获取老人新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "/agenews/getAgeNews")
    public List<Map> getAgeNews( ) {
    	
    	return headlineFeignService.getAgeNews();
    }

   
}
