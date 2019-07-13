package com.kedi.othersourcecenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.othersourcecenter.service.OtherSourceCenterService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 长者健康控制层
* @author: dw 
* @date: 2019 2019年7月8日 下午2:00:59
 */
@RestController
public class OtherSourceCenterController {
    @Autowired
    private OtherSourceCenterService otherSourceCenterService;
   

    @RequestMapping(value = "/getothersource")
    public List<Map> getothersource() {
    	
        return otherSourceCenterService.selectothersource();
    }

   
}
