package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.CommunitysalonService;

/**
 * 
 *
 * @ClassName	CommunitysalonController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:54
 */
@Controller
public class CommunitysalonController {
	
	 @Autowired
	    public CommunitysalonService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectcommunitysalon
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/selectcommunitysalon")
	    @ResponseBody
	    public List<Map<String, Object>> selectcommunitysalon() {
	    	List<Map<String,Object>> users = service.communitysalon();
	        return users;
	    }

}
