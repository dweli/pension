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
 *
 * @ClassName	OperaController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:13
 */
@Controller
public class OperaController {
	
	 @Autowired
	    public OperaService service;
	 
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectopera
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectopera")
	    @ResponseBody
	    public List<Map<String, Object>> selectopera() throws Throwable, IOException {
	    	List<Map<String,Object>> userid = service.opera();
			return userid;	  
	    }
}
