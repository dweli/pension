package com.kedi.older.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.older.servie.PcVolunteerService;




/**
 * 
 *
 * @ClassName	PcVolunteerController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:07
 */
@Controller
public class PcVolunteerController {
	
	 @Autowired
	    public PcVolunteerService service;
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectvolunteerpart
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectvolunteerpart")
	    @ResponseBody
	    public List<Map<String, Object>> selectvolunteerpartt() {
		 return service.volunteerpart();
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectvolunteerall
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectvolunteerall")
	 @ResponseBody
	 public List<Map<String, Object>> selectvolunteerall(int volunteerid) {
		 return service.volunteerall(volunteerid);
	 }
	 

	 @RequestMapping(value = "/updatevolunteer",method=RequestMethod.POST)
	 @ResponseBody
	 public int updatevolunteer(@RequestParam Map map) {
		 return service.volunteer(map);
	 }
	 
	 @RequestMapping(value = "/insertivolunteer",method=RequestMethod.POST)
	 @ResponseBody
	 public int insertivolunteer(@RequestParam Map map) {
		 return service.ivolunteer(map);
	 }
	 @RequestMapping(value = "/insertivolunteerpictures",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean insertiVolunteerPictures(@RequestParam Map map) {
		 return service.ivolunteerpictures(map);
	 }
	 @RequestMapping(value = "/updatevolunteerpictures",method=RequestMethod.POST)
	 @ResponseBody
	 public boolean updatevolunteerpictures(@RequestParam Map map) {
		 return service.volunteerpictures(map);
	 }
}
