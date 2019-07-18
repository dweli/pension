package com.kedi.homeservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.homeservice.service.BusinessHealthFeignService;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 家政服务商家业务层接口
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:01
 * Version 1.0
 **/
@RestController
public class BusinessHealthController {
    @Autowired
    private BusinessHealthFeignService businessHealthFeignService;

    
    @RequestMapping(value = "/businesscommodity/getBusiness",method = RequestMethod.GET)
    public List<Map> getBusiness() {
    	
        return businessHealthFeignService.getBusiness();
    }
    
    @RequestMapping(value = "/classname/getclassname",method = RequestMethod.GET)
    public List<Map> getclassname(@RequestParam String name) {
    	
    	return businessHealthFeignService.getclassname(name);
    }
    
    @RequestMapping(value = "/business/updatebusiness",method = RequestMethod.POST)
    public int updatebusiness(@RequestParam Map map) {
    	
    	return businessHealthFeignService.updatebusiness(map);
    }
    @RequestMapping(value = "/merchant/insertmerchant",method = RequestMethod.POST)
    public boolean insertmerchant(@RequestParam Map map) {
    	
    	return businessHealthFeignService.insertmerchant(map);
    }

   
}
