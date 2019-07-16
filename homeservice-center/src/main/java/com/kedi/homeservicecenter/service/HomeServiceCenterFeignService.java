package com.kedi.homeservicecenter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:02
 * Version 1.0
 **/
@FeignClient(value = "app-old-homeservice-r", fallback = HomeServiceCenterServiceFallBackImpl.class)
public interface HomeServiceCenterFeignService {
	
   /**
    * @Description:根据用户id获取对应健康标签与对应食物的关系表
    * @param puserid
    * @return
    */
    @RequestMapping(value = "/selectcommodity", method = RequestMethod.GET)
    List<Map> selectBusinessCommodity();
    
    
    @RequestMapping(value = "/selectclassname", method = RequestMethod.GET)
    List<Map> selectclassname(@RequestParam String name);
    
    @RequestMapping(value = "/updatebusiness", method = RequestMethod.POST)
    int updatebusiness(@RequestParam Map map);
    
    @RequestMapping(value = "/insertmerchant", method = RequestMethod.POST)
    boolean insertmerchant(@RequestParam Map map);

}
