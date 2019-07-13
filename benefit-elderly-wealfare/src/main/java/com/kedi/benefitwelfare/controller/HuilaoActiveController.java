package com.kedi.benefitwelfare.controller;


import com.kedi.benefitwelfare.service.HuilaoActiveFeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description 惠老活动业务层接口
 * @Author dw
 * @Date 2019/7/1  17:01
 * Version 1.0
 **/
@RestController
public class HuilaoActiveController {
    @Autowired
    private HuilaoActiveFeignService huilaoActiveFeignService;
    
    @RequestMapping(value = "/huilaoactive/list")
    public List<Map> getCivilWelfareList() {
        return huilaoActiveFeignService.getHuilaoActiveList();
    }
    
    @RequestMapping(value = "/huilaoactive/detail", method = RequestMethod.GET)
    public Map getCivilWelfareDetail(Integer id){
		
    	return huilaoActiveFeignService.getHuilaoActiveDetail(id);
    };

   
}
