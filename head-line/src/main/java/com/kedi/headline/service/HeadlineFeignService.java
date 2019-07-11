package com.kedi.headline.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerClientService
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/
@FeignClient(value = "headline-center", fallback = HeadlineServiceFallBackImpl.class)
public interface HeadlineFeignService {

    /**
     * 
     * @Description  获取国内新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "/getHomeNews", method = RequestMethod.GET)
    List<Map> getHomeNews();
    /**
     * 
     * @Description  获取国际新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "/getInternationnalNews", method = RequestMethod.GET)
    List<Map> getInternationnalNews();
    /**
     * 
     * @Description  获取省内新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "getProvincialNews", method = RequestMethod.GET)
    List<Map> getProvincialNews();
    /**
     * 
     * @Description  获取老人新闻所有信息表
     * @Author clx
     * @Date 2019/7/11  15:46
     * Version 1.0
     */
    @RequestMapping(value = "/getAgeNews", method = RequestMethod.GET)
    List<Map> getAgeNews();
    
    


}
