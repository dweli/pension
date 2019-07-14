package com.kedi.headlinecenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.headlinecenter.service.HeadlineService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 每日头条控制层
* @author: clx 
* @date: 2019 2019年7月11日 下午15:35:59
 */
@RestController
public class HeadlineController {
    @Autowired
    private HeadlineService headlineService;
    /**
     * @Description:获取国内新闻所有信息表
     * @return
     */  
    @RequestMapping(value = "/getHomeNews")
    public List<Map> getHomeNews() {
    	
        return headlineService.selecthomenews();
    }
    /**
     *  @Description:获取国际新闻所有信息表
     * @return
     */   
    @RequestMapping(value = "/getInternationnalNews")
    public List<Map> getInternationnalNews() {
    	
    	return headlineService.selectinternationalnews();
    }
    /**
     * @Description: 省内新闻所有信息
     * @return
     */
    @RequestMapping(value = "/getProvincialNews")
    public List<Map> getProvincialNews() {
    	
    	return headlineService.selectprovincialnews();
    }
    /**
     * @Description: 获取老人新闻所有信息
     * @return
     */
    @RequestMapping(value = "/getAgeNews")
    public List<Map> getAgeNews() {
    	
    	return headlineService.selectagenews();
    }
   
}
