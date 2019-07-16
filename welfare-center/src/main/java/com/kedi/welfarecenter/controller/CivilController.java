package com.kedi.welfarecenter.controller;


import com.kedi.welfarecenter.service.CivilWelfareService;
import com.kedi.welfarecenter.service.VolunteersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 返回志愿者信息
* @author: dw 
* @date: 2019 2019年7月9日 下午4:34:09
 */
@RestController
public class CivilController {
	  @Autowired
	    private CivilWelfareService civilWelfareService;
	   

	    @RequestMapping(value = "/civil/list")
	    public List<Map> getJobVolunteerList() {
	    	
	        return civilWelfareService.getCivilWelfareList();
	    }
	    @RequestMapping(value = "/civil/detail")
	    public Map getVolunteerDetail(Integer id) {
	    	
	    	return civilWelfareService.getCivilWelfareDetail(id);
	    }
}
