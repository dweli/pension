package com.kedi.healthcenter.controller;


import com.kedi.healthcenter.service.ElderlyHealthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 长者健康控制层
* @author: dw 
* @date: 2019 2019年7月8日 下午2:00:59
 */
@RestController
public class ElderlyHeathController {
    @Autowired
    private ElderlyHealthService elderlyHealthService;
   

    @RequestMapping(value = "/getelderlyfood/byuserid")
    public List<Map> getFood(int olduserid) {
    	
        return elderlyHealthService.selectFood(olduserid);
    }

   
}
