package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.dao.ReviewMapper;


/**
 * 
 *
 * @ClassName	ReviewController
 * @author: 	陈辽逊
 * @date: 		2019/713 11:13
 */
@Controller
public class ReviewController {
	
	 @Autowired
	    public ReviewMapper service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectreview
	  * @return		    返回一个数据对象	
	  */	 
	 @RequestMapping("/selectreview")
	    @ResponseBody
	    public List<Map<String, Object>> selectsreview() throws Throwable, IOException {
	    	List<Map<String,Object>> userid = service.review();
			return userid;	  
	    }
}
