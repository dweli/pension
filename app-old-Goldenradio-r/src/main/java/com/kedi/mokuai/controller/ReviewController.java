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
 * @author 陈辽逊
 *
 */
@Controller
public class ReviewController {
	
	 @Autowired
	    public ReviewMapper service;

	 @RequestMapping("/selectreview")
	    @ResponseBody
	    public List<Map<String, Object>> selectsreview() throws Throwable, IOException {
	    	System.out.println("进入了方法4");
	    	List<Map<String,Object>> userid = service.review();
			return userid;	  
	    }
}
