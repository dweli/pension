package com.kedi.homeservicecenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.homeservicecenter.service.HomeServiceCenterFeignService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 家政服务商家控制层
* @author: clx 
* @date: 2019 2019年7月8日 下午2:00:59
 */
@RestController
public class HomeServiceCenterController {
    @Autowired
    private HomeServiceCenterFeignService homeServiceCenterFeignService;
   

    @RequestMapping(value = "/getbusinesscommodity")
    public List<Map> getbusinesscommodity() {
    	
        return homeServiceCenterFeignService.selectBusinessCommodity();
    }

   
}
