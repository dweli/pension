package com.kedi.older.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.older.servie.VolunteerService;




/**
 * 
 *
 * @ClassName	VolunteerController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:07
 */
@Controller
public class VolunteerController {
	
	 @Autowired
	    public VolunteerService service;
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectvolunteerpart
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectvolunteerpart")
	    @ResponseBody
	    public List<Map<String, Object>> selectvolunteerpartt() {
	    	List<Map<String,Object>> userid = service.volunteerpart();
			return userid;	  
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectvolunteerall
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectvolunteerall")
	 @ResponseBody
	 public List<Map<String, Object>> selectvolunteerall(int volunteerid) {
		 List<Map<String,Object>> userid = service.volunteerall(volunteerid);
		 return userid;	  
	 }
	 

	 @RequestMapping(value = "/updatevolunteer",method=RequestMethod.POST)
	 @ResponseBody
	 public int updatevolunteer(@RequestParam Map map) {
		 int userid = service.volunteer(map);
		 return userid;	  
	 }
	 
	 @RequestMapping(value = "/ivolunteer",method=RequestMethod.POST)
	 @ResponseBody
	 public int ivolunteer(@RequestParam Map map) {
		 int userid = service.ivolunteer(map);
		 return userid;	    
	 }
	 @RequestMapping(value = "/iVolunteerPictures",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean iVolunteerPictures(@RequestParam Map map) {
		 boolean userid = service.iVolunteerPictures(map);
		 return userid;	    
	 }
	 @RequestMapping(value = "/VolunteerPictures",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean VolunteerPictures(@RequestParam Map map) {
		 boolean userid = service.VolunteerPictures(map);
		 return userid;	    
	 }
}
