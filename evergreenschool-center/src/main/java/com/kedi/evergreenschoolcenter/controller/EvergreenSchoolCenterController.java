package com.kedi.evergreenschoolcenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.evergreenschoolcenter.service.EvergreenSchoolCenterService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 常青学苑控制层
* @author: dw 
* @date: 2019 2019年7月8日 下午2:00:59
 */
@RestController
public class EvergreenSchoolCenterController {
    @Autowired
    private EvergreenSchoolCenterService evergreenSchoolCenterService;
   
    /**
     * @Description:获取在线课堂的所有信息表
     * @param puserid
     * @return
     */
    @RequestMapping(value = "/getsselectonline")
    public List<Map> getsselectonline() {
    	
        return evergreenSchoolCenterService.selectonline();
    }
    /**
     * @Description:获取社区沙龙的所有信息
     * @param puserid
     * @return
     */
    @RequestMapping(value = "/getselectcommunitysalon")
    public List<Map> getselectcommunitysalon() {
    	
    	return evergreenSchoolCenterService.selectcommunitysalon();
    }
    /**
     * @Description:获取课程报名的所有信息表
     * @param puserid
     * @return
     */
    @RequestMapping(value = "/getselectcoursereg")
    public List<Map> getselectcoursereg() {
    	
    	return evergreenSchoolCenterService.selectcoursereg();
    }

   
}
