package com.kedi.homeservicecenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.homeservicecenter.service.HomeServiceCenterService;

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
    private HomeServiceCenterService homeServiceCenterFeignService;
   

    @RequestMapping(value = "/getbusinesscommodity",method = RequestMethod.GET)
    public List<Map> getbusinesscommodity() {
    	
        return homeServiceCenterFeignService.selectBusinessCommodity();
    }
    
    @RequestMapping(value = "/commoditydetailbyid", method = RequestMethod.GET)
    Map<String,Object> getCommodityDetailbyid(@RequestParam Integer id){
		return homeServiceCenterFeignService.getCommodityDetailbyid(id);
    	
    }
    
}
