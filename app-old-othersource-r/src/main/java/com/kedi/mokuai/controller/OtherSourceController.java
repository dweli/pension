package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OtherSourceService;

/**
 * @version:		1.0
 * @Description: 	
 * @author: 		陈辽逊
 * @date: 			2019-7-8 10:54
 */
@Controller
public class OtherSourceController {
	
	 @Autowired
	    public OtherSourceService service;

	    @RequestMapping("/selectOtherSource")
	    @ResponseBody
	    public List<Map<String, Object>> selectOtherSource() throws Throwable, IOException {
	    	System.out.println("进入了方法");
	    	List<Map<String,Object>> users = service.othersource();
	        return users;
	    } 
	    
	    
	    //post方式
	    /*@RequestMapping(value="/selectOtherSource",method = RequestMethod.POST,consumes = "application/json")
	    @ResponseBody
	    public List<Map<String, Object>> selectOtherSource() throws Throwable, IOException {
	    	System.out.println("进入了方法");
	    	List<Map<String,Object>> users = service.othersource();
	    	return users;
	    } */
}
