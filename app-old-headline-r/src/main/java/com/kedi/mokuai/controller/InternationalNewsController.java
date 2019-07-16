package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.InternationalNewsService;

/**
 * @version:		1.0
 * @Description: 	
 * @author: 		陈辽逊
 * @date: 			2019-7-8 10:54
 */
@Controller
public class InternationalNewsController {
	
	 @Autowired
	    public InternationalNewsService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectinternationalnews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/selectinternationalnews")
	    @ResponseBody
	    public List<Map<String, Object>> selectinternationalnews() {
	    	List<Map<String,Object>> users = service.internationalnews();
	        return users;
	    }	    
}
