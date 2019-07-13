package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OldlifeService;

/**
 * @version:		1.0
 * @Description: 	
 * @author: 		陈辽逊
 * @date: 			2019-7-8 10:54
 */
@Controller
public class OldlifeController {
	
	 @Autowired
	    public OldlifeService service;

	    @RequestMapping("/selectUser")
	    @ResponseBody
	    public List<Map<String, Object>> selectUser() throws Throwable, IOException {
	    	System.out.println("进入了方法");
	    	List<Map<String,Object>> users = service.findByName();
	        return users;
	    }
	    @RequestMapping("/selectoldprice")
	    @ResponseBody
	    public List<Map<String, Object>> selectoldprice(int minprice,int maxprice) throws Throwable, IOException {
	    	System.out.println("进入了方法2");
	    	List<Map<String,Object>> selectoldprice = service.oldprice(minprice, maxprice);
	    	return selectoldprice;	  
	    }
	    
}
