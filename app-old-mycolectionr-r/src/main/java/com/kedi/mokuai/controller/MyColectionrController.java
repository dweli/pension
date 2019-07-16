package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.mokuai.service.MyColectionrService;


/**
 * 
 *
 * @ClassName	MyColectionrController
 * @author: 	陈辽逊
 * @date: 		2019/713
 */
@RestController
public class MyColectionrController {
	
	 @Autowired
	    public MyColectionrService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectcolection
	  * @return		    根据puserid返回一个数据对象	
	  */
	 @RequestMapping("/selectcolection")
	    @ResponseBody
	    public List<Map<String, Object>> selectcommodity(int puserid) {
	    	List<Map<String,Object>> userid = service.colection(puserid);
			return userid;	  
	    }
}
