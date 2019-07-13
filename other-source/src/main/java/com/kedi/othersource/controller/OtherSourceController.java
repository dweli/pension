package com.kedi.othersource.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.othersource.service.OtherSourceFeignService;

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
public class OtherSourceController {
    @Autowired
    private OtherSourceFeignService othersSourceFeignService;

    
    @RequestMapping(value = "/othersource/getothersource")
    public List<Map> getothersource( ) {
    	
        return othersSourceFeignService.getothersource();
    }

   
}
