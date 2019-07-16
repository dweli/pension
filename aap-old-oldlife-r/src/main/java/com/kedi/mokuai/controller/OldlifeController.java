package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OldlifeService;

/**
 * 
 *
 * @ClassName	OldlifeController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:42
 */
@Controller
public class OldlifeController {
	
	 @Autowired
	    public OldlifeService service;
	 
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectUser
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/selectUser")
	    @ResponseBody
	    public List<Map<String, Object>> selectUser(){
	    	List<Map<String,Object>> users = service.findByName();
	        return users;
	    }
	  /**
	   * @Description:	获取前台提交的参数，指定映射方法名为/selectoldprice
	   * @param 		minprice
	   * @param 		maxprice
	   * @return		（根据minprice和maxprice返回数据对象）
	   */
	    @RequestMapping("/selectoldprice")
	    @ResponseBody
	    public List<Map<String, Object>> selectoldprice(int minprice,int maxprice) {
	    	List<Map<String,Object>> selectoldprice = service.oldprice(minprice, maxprice);
	    	return selectoldprice;	  
	    }
	    
}
