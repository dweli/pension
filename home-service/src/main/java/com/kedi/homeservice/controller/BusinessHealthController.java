package com.kedi.homeservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    
    @RequestMapping(value = "/BusinessCommodity/getBusiness")
    public List<Map> getBusiness() {
    	
        return businessHealthFeignService.getBusiness();
    }

   
}
