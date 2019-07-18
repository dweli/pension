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
import com.kedi.older.servie.PcOldManService;




/**
 * 
 *
 * @ClassName	OldhomeController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:07
 */
@Controller
public class PcOldmanController {
	
	 @Autowired
	    public PcOldManService service;
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectoldmanpart
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectoldmanpart")
	    @ResponseBody
	    public List<Map<String, Object>> selectoldmanpart() {
	    	List<Map<String,Object>> userid = service.oldpart();
			return userid;	  
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectoldmanall
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectoldmanall")
	 @ResponseBody
	 public List<Map<String, Object>> selectoldmanall(int elderlyid) {
		 List<Map<String,Object>> userid = service.oldall(elderlyid);
		 return userid;	  
	 }
	 
	 @RequestMapping(value = "/updateelderly",method=RequestMethod.POST)
	 @ResponseBody
	 public int updateelderly(@RequestParam Map map) {
		 int userid = service.elderly(map);
		 return userid;	  
	 }
	 
	 @RequestMapping(value = "/insertielderly",method=RequestMethod.POST)
	 @ResponseBody
	 public int insertielderly(@RequestParam Map map) {
		 int userid = service.ielderly(map);
		 return userid;	    
	 }
}
