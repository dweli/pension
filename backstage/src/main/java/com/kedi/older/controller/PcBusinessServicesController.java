package com.kedi.older.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.older.servie.PcBusinessServicesService;




/**
 * 
 *
 * @ClassName	OldhomeController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:07
 */
@Controller
public class PcBusinessServicesController {
	
	 @Autowired
	    public PcBusinessServicesService service;
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectclassname
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectclassname")
	    @ResponseBody
	    public List<Map<String, Object>> selectclassname(String name) {
	    	List<Map<String,Object>> userid = service.classname(name);
			return userid;	  
	    }
	 /**
	  * @Description:  点赞
	  * @param 		   businessid
	  */
	 @RequestMapping(value = "/updatelikenum",method=RequestMethod.POST)
	 @ResponseBody
	 public int updatelikenum(@RequestParam int businessid) {
		 int userid = service.updatelikenum(businessid);
		 return userid;	  
	 }
	 /**
	  * @Description: 我的收藏
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping(value = "/updatecollectnum",method=RequestMethod.POST)
	 @ResponseBody
	 public int updatecollectnum(@RequestParam int businessid) {
		 int userid = service.updatecollectnum(businessid);
		 return userid;	  
	 }
	 @RequestMapping(value = "/updatebusiness",method=RequestMethod.POST)
	 @ResponseBody
	 public int updatebusiness(@RequestParam Map map) {
		 int userid = service.business(map);
		 return userid;	  
	 }
	 @RequestMapping(value = "/insertmerchant",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean insertmerchant(@RequestParam Map map) {
		 boolean b = service.merchant(map);
		 return b;	  
	 }
}
