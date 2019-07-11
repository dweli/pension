package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OldhealthService;


/**
 * @version:		1.0
 * @Description: （对类进行功能描述
 * @author: 		陈辽逊 
 * @date: 			2019-7-8 11.17
 */
@Controller
public class OldhealthController {
	
	 @Autowired
	    public OldhealthService service;

	  @RequestMapping("/selectpuser")
	    @ResponseBody
	    public List<Map<String, Object>> selectpuser(int olduserid) throws Throwable, IOException {
	    	List<Map<String,Object>> userid = service.olduserid(olduserid);
	      /*  for (Map<String, Object> map : userid) {
	            for (Map.Entry<String, Object> m : map.entrySet()) {
	            	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	                if ("introduce".equals(m.getKey())) {
                	byte[] b=(byte[])m.getValue();
                	m.setValue(new String(b));
					}
	            }	          
	    	}*/
			return userid; 
	    }
}
