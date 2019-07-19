package com.kedi.evergreenschoolcenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;







import com.kedi.evergreenschoolcenter.feign.service.EvergreenSchoolCenterService;
import com.kedi.evergreenschoolcenter.service.CommunitysalonService;
import com.kedi.evergreenschoolcenter.service.CourseRegClassService;
import com.kedi.evergreenschoolcenter.service.OnlineclassService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 常青学苑控制层
* @author: clx
* @date: 2019 2019年7月8日 下午2:00:59
 */
@RestController
public class EvergreenSchoolCenterController {
    
    @Autowired
    CommunitysalonService communitysalonService;
    @Autowired
    CourseRegClassService courseRegClassService;
    @Autowired
    OnlineclassService onlineclassService;
   
    @RequestMapping("/selectcommunitysalon")
    public List<Map<String, Object>> selectcommunitysalon() {
    	List<Map<String,Object>> users = communitysalonService.communitysalon();
        return users;
    }
    
    @RequestMapping("/selectcoursereg")
    public List<Map<String, Object>> selectcoursereg() {
    	List<Map<String,Object>> users = courseRegClassService.coursereg();
        return users;
    }
    
    @RequestMapping("/selectcalss")
    public List<Map<String, Object>> selectcalss() {
    	List<Map<String,Object>> users = onlineclassService.calss();
        return users;
    }
    
    @RequestMapping("/selectonline")
    public List<Map<String, Object>> selectonline(int cal) {
    	List<Map<String,Object>> users = onlineclassService.online(cal);
    	return users;
    }
   
}
