package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.mokuai.service.MyColectionrService;


/**
 * 
 * @author 陈辽逊
 *
 */
@RestController
public class MyColectionrController {
	
	 @Autowired
	    public MyColectionrService service;

	 @RequestMapping("/selectcolection")
	    @ResponseBody
	    public List<Map<String, Object>> selectcommodity(int puserid) throws Throwable, IOException {
	    	System.out.println("进入了方法4");
	    	List<Map<String,Object>> userid = service.colection(puserid);
			return userid;	  
	    }
}
