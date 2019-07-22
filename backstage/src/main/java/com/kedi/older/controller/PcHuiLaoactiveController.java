package com.kedi.older.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.older.servie.PcHuiLaoactiveService;




/**
 * 
 *
 * @ClassName	PcHuiLaoactiveController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:07
 */
@Controller
public class PcHuiLaoactiveController {
	
	 @Autowired
	    public PcHuiLaoactiveService service;
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selecthuilaoactivepart
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selecthuilaoactivepart")
	    @ResponseBody
	    public List<Map<String, Object>> selecthuilaoactivepart() {
	    	List<Map<String,Object>> userid = service.huilaoactivepart();
			return userid;	  
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selecthuilaoactiveall
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selecthuilaoactiveall")
	 @ResponseBody
	 public List<Map<String, Object>> selecthuilaoactiveall(int activeid) {
		 List<Map<String,Object>> userid = service.huilaoactiveall(activeid);
		 return userid;	  
	 }
	 


	 @RequestMapping(value = "/inserthuilaoactive",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean inserthuilaoactive(@RequestParam Map map) {
		 boolean userid = service.ihuilaoactive(map);
		 return userid;	    
	 }
	 @RequestMapping(value = "/updateihuilaoactive",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean updateihuilaoactive(@RequestParam Map map) {
		 boolean userid = service.huilaoactive(map);
		 return userid;	    
	 }
}
