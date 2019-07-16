package com.kedi.evergreenschool.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.evergreenschool.service.EvergreenSchoolFeignService;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 常青学苑业务层接口
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:01
 * Version 1.0
 **/
@RestController
public class EvergreenSchoolController {
    @Autowired
    private EvergreenSchoolFeignService evergreenSchoolFeignService;

    /**
     * @Description:长青学院 在线课堂
     * @return
     */
    @RequestMapping(value = "/selectonline/getsselectonline")
    public List<Map> getsselectonline() {
    	
        return evergreenSchoolFeignService.getsselectonline();
    }
    /**
     * @Description:社区沙龙
     * @return
     */
    @RequestMapping(value = "/communitysalon/getselectcommunitysalon")
    public List<Map> getselectcommunitysalon() {
    	
    	return evergreenSchoolFeignService.getselectcommunitysalon();
    }
    @RequestMapping(value = "/coursereg/getselectcoursereg")
    public List<Map> getselectcoursereg() {
    	
    	return evergreenSchoolFeignService.getselectcoursereg();
    }

   
}
