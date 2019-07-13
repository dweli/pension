package com.kedi.welfarecenter.controller;


import com.kedi.welfarecenter.service.WelfareService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: app惠老福利接口
* @author: dw 
* @date: 2019 2019年7月9日 上午11:17:54
 */
@RestController
public class WelfareController {
    @Autowired
    private WelfareService elderlyHealthService;
   

    @RequestMapping(value = "/job/list")
    public List<Map> getJobList() {
    	
        return elderlyHealthService.getJobList();
    }
    @RequestMapping(value = "/job/detail")
    public Map getJobDetail(Integer id) {
    	
    	return elderlyHealthService.getJobDetail(id);
    }

   
}
