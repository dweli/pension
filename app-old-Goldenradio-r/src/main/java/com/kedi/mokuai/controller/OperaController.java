package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OperaService;


/**
 * 
 * @author 陈辽逊
 *
 */
@Controller
public class OperaController {
	
	 @Autowired
	    public OperaService service;

	 @RequestMapping("/selectopera")
	    @ResponseBody
	    public List<Map<String, Object>> selectopera() throws Throwable, IOException {
	    	System.out.println("进入了方法4");
	    	List<Map<String,Object>> userid = service.opera();
			return userid;	  
	    }
}
