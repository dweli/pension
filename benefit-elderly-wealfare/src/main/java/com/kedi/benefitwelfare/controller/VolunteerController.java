package com.kedi.benefitwelfare.controller;


import com.kedi.benefitwelfare.service.VolunteerFeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description 志愿者业务层接口
 * @Author dw
 * @Date 2019/7/1  17:01
 * Version 1.0
 **/
@RestController
public class VolunteerController {
    @Autowired
    private VolunteerFeignService volunteerFeignService;
    
    @RequestMapping(value = "/volunteer/list")
    public List<Map> getJobVolunteerList() {
        return volunteerFeignService.getJobVolunteerList();
    }
    
    @RequestMapping(value = "/volunteer/detail", method = RequestMethod.GET)
    public Map getVolunteerDetail(Integer id){
		
    	return volunteerFeignService.getVolunteerDetail(id);
    };

   
}
