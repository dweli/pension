package com.kedi.mycolectionr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.mycolectionr.service.MyColectionrFeignService;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 我的收藏业务层接口
 * @Description
 * @Author clx
 * @Date 2019/7/12  17:01
 * Version 1.0
 **/
@RestController
public class MyColectionrController {
    @Autowired
    private MyColectionrFeignService myColectionrFeignService;

    
    @RequestMapping(value = "/colection/getcolection")
    public List<Map> getcolection(int puserid) {
    	
        return myColectionrFeignService.getcolection(puserid);
    }

   
}
