package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OldhomeService;


/**
 * 
 *
 * @ClassName	OldhomeController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:07
 */
@Controller
public class OldhomeController {
	
	 @Autowired
	    public OldhomeService service;
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectcommodity
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectcommodity")
	    @ResponseBody
	    public List<Map<String, Object>> selectcommodity() {
	    	List<Map<String,Object>> userid = service.commodity();

			return userid;	  
	    }
}
