package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.dao.ProvincialNewsMapper;

/**
 * 
 *
 * @ClassName	ProvincialNewsController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:57
 */
@Controller
public class ProvincialNewsController {
	
	 @Autowired
	    public ProvincialNewsMapper service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectprovincialnews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/selectprovincialnews")
	    @ResponseBody
	    public List<Map<String, Object>> selectprovincialnews() {
	    	List<Map<String,Object>> users = service.provincialnews();
	        return users;
	    }
}
