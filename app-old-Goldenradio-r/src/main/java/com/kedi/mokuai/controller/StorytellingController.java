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
 * @author 陈辽逊
 *
 */
@Controller
public class StorytellingController {
	
	 @Autowired
	    public StorytellingService service;

	 @RequestMapping("/selectstorytelling")
	    @ResponseBody
	    public List<Map<String, Object>> selectstorytelling() throws Throwable, IOException {
	    	System.out.println("进入了方法4");
	    	List<Map<String,Object>> userid = service.storytelling();
			return userid;	  
	    }
}
