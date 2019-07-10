package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OldhomeService;


/**
 * 
 * @author 陈辽逊
 *
 */
@Controller
public class OldhomeController {
	
	 @Autowired
	    public OldhomeService service;

	 @RequestMapping("/selectcommodity")
	    @ResponseBody
	    public List<Map<String, Object>> selectcommodity() throws Throwable, IOException {
	    	System.out.println("进入了方法4");
	    	List<Map<String,Object>> userid = service.commodity();
	        /*for (Map<String, Object> map : userid) {
	            for (Map.Entry<String, Object> m : map.entrySet()) {
	            	System.out.println(m.getKey());
	            	System.out.println(m.getValue());
	            	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	                if ("describle".equals(m.getKey())) {
	             	byte[] b=(byte[])m.getValue();
	             	m.setValue(new String(b));
					}
	            }	          
	    	}*/
			return userid;	  
	    }
	/* @RequestMapping("/selectbusiness")
	    @ResponseBody
	 public List<Map<String, Object>> selectbusiness(int puserid) throws Throwable, IOException {
	    	List<Map<String,Object>> userid = service.business(puserid);	        
			return userid;	  
	    }
	    */
}
