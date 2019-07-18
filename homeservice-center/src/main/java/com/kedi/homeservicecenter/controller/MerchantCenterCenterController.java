package com.kedi.homeservicecenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.homeservicecenter.service.MerchantCenterFeignService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 家政服务商家控制层
* @author: clx 
* @date: 2019 2019年7月8日 下午2:00:59
 */
@RestController
public class MerchantCenterCenterController {
   @Autowired
    private MerchantCenterFeignService merchantCenterFeignService;
   

    
   /*  @RequestMapping(value = "/getclassname",method = RequestMethod.GET)
    public List<Map> getclassname(@RequestParam String name) {
    	
    	return merchantCenterFeignService.selectclassname(name);
    }
    
    @RequestMapping(value = "/updatebusiness",method = RequestMethod.POST)
    public int updatebusiness(@RequestParam Map map) {
    	
    	return merchantCenterFeignService.updatebusiness(map);
    }

    @RequestMapping(value = "/insertmerchant",method = RequestMethod.POST)
    public boolean insertmerchant(@RequestParam Map map) {
    	
    	return merchantCenterFeignService.insertmerchant(map);
    }*/
}
