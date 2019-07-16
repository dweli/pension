package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.HomenewsService;

/**
 * 
 *
 * @ClassName	HomenewsController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:00
 */
@Controller
public class HomenewsController {
	
	 @Autowired
	    public HomenewsService service;
	 
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selecthomenews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/selecthomenews")
	    @ResponseBody
	    public List<Map<String, Object>> selecthomenews() {
	    	List<Map<String,Object>> users = service.homenews();
	        return users;
	    }

}
