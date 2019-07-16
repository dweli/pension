package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.StorytellingService;


/**
 * 
 *
 * @ClassName	StorytellingController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:14
 */
@Controller
public class StorytellingController {
	
	 @Autowired
	    public StorytellingService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectstorytelling
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectstorytelling")
	    @ResponseBody
	    public List<Map<String, Object>> selectstorytelling() throws Throwable, IOException {
	    	List<Map<String,Object>> userid = service.storytelling();
			return userid;	  
	    }
}
