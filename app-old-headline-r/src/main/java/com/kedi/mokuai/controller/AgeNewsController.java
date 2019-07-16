package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.AgeNewsService;


/**
 * 
 *
 * @ClassName	AgeNewsController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:26
 */
@Controller
public class AgeNewsController {
	
	 @Autowired
	    public AgeNewsService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectagenews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/selectagenews")
	    @ResponseBody
	    public List<Map<String, Object>> selectagenews() {
	    	List<Map<String,Object>> users = service.agenews();
	        return users;
	    }

}
