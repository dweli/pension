package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.onlineclassService;

/**
 * @version:		1.0
 * @Description: 	
 * @author: 		陈辽逊
 * @date: 			2019-7-8 10:54
 */
@Controller
public class OnlineClassController {
	
	 @Autowired
	    public onlineclassService service;
	 
	 /**
	  * @Description:	获取前台提交的参数，指定映射方法名为/selectcalss
	  * @return			返回一个数据对象
	  */
	    @RequestMapping("/selectcalss")
	    @ResponseBody
	    public List<Map<String, Object>> selectcalss() {
	    	List<Map<String,Object>> users = service.calss();
	        return users;
	    }
	    /**
	     * @Description: 获取前台提交的参数，指定映射方法名为/selectonline
	     * @param 		 calss
	     * @return		 返回一个数据对象
	     */
	    @RequestMapping("/selectonline")
	    @ResponseBody
	    public List<Map<String, Object>> selectonline(int calss) {
	    	List<Map<String,Object>> users = service.online(calss);
	    	return users;
	    }
	    
}
