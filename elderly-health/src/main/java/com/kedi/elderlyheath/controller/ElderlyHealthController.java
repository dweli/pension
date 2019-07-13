package com.kedi.elderlyheath.controller;


import com.kedi.elderlyheath.service.ElderlyHealthFeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 长者健康业务层接口
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:01
 * Version 1.0
 **/
@RestController
public class ElderlyHealthController {
    @Autowired
    private ElderlyHealthFeignService consumerClientService;
    
    
    @RequestMapping(value = "/elderly/getfood")
    public List<Map> getFood(int olduserid) {
    	
        return consumerClientService.getFood(olduserid);
    }

   
}
