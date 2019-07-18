package com.kedi.older.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.older.servie.PcOldLifeService;




/**
 * 
 *
 * @ClassName	PcOldLifeController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:07
 */
@Controller
public class PcOldLifeController {
	
	 @Autowired
	    public PcOldLifeService service;
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectoldpart
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectoldlifepart")
	    @ResponseBody
	    public List<Map<String, Object>> selectoldlifepart() {
	    	List<Map<String,Object>> userid = service.oldlifepart();
			return userid;	  
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectvolunteerall
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectoldlifeall")
	 @ResponseBody
	 public List<Map<String, Object>> selectoldlifeall(int oldlifeid) {
		 List<Map<String,Object>> userid = service.oldlifeall(oldlifeid);
		 return userid;	  
	 }
	 


	 @RequestMapping(value = "/insertibedoldlife",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean insertibedoldlife(@RequestParam Map map) {
		 boolean userid = service.ibedoldlife(map);
		 return userid;	    
	 }
	 @RequestMapping(value = "/updatebedoldlife",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean updatebedoldlife(@RequestParam Map map) {
		 boolean userid = service.bedoldlife(map);
		 return userid;	    
	 }
}
