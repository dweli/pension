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
		 return service.huilaoactivepart();
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selecthuilaoactiveall
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selecthuilaoactiveall")
	 @ResponseBody
	 public List<Map<String, Object>> selecthuilaoactiveall(int activeid) {
		 return service.huilaoactiveall(activeid);
	 }
	 


	 @RequestMapping(value = "/inserthuilaoactive",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean inserthuilaoactive(@RequestParam Map map) {
		 return service.ihuilaoactive(map);
	 }
	 @RequestMapping(value = "/updateihuilaoactive",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean updateihuilaoactive(@RequestParam Map map) {
		 return service.huilaoactive(map);
	 }
}
