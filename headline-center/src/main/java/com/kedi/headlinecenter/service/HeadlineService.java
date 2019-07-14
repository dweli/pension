package com.kedi.headlinecenter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author clx
 * @Date 2019/7/11  15:37
 * Version 1.0
 **/
@FeignClient(value = "app-old-headline-r", fallback = HeadlineServiceFallBackImpl.class)
public interface HeadlineService {
	
   /**
    * @Description:获取国内新闻所有信息表
    * @return
    */
    @RequestMapping(value = "/selecthomenews", method = RequestMethod.GET)
    List<Map> selecthomenews();
   /**
    *  @Description:获取国际新闻所有信息表
    * @return
    */
    @RequestMapping(value = "/selectinternationalnews", method = RequestMethod.GET)
    List<Map> selectinternationalnews();
   /**
   * @Description: 省内新闻所有信息
   * @return
   */
    @RequestMapping(value = "/selectprovincialnews", method = RequestMethod.GET)
    List<Map> selectprovincialnews();
    /**
     * @Description: 获取老人新闻所有信息
     * @return
     */
    @RequestMapping(value = "/selectagenews", method = RequestMethod.GET)
    List<Map> selectagenews();

}
