package com.kedi.welfarecenter.controller;


import com.kedi.welfarecenter.service.VolunteersService;
import com.kedi.welfarecenter.service.WelfareService;

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
public class VolunteerController {
    @Autowired
    private VolunteersService volunteersService;
   

    @RequestMapping(value = "/volunteer/list")
    public List<Map> getJobVolunteerList() {
    	
        return volunteersService.getJobVolunteerList();
    }
    @RequestMapping(value = "/volunteer/detail")
    public Map getVolunteerDetail(Integer id) {
    	
    	return volunteersService.getVolunteerDetail(id);
    }

   
}
