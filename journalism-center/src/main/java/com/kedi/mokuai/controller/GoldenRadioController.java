package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.GoldenRadioService;


/**
 * 
 *
 * @ClassName	StorytellingController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:14
 */
@Controller
public class GoldenRadioController {
	
	 @Autowired
	    public GoldenRadioService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectstorytelling
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/getstorytelling")
	    @ResponseBody
	    public List<Map<String, Object>> getstorytelling() {
		 return service.storytelling();
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectopera
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/getopera")
	    @ResponseBody
	    public List<Map<String, Object>> getopera() {
		 return service.opera();
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectmusic
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/getmusic")
	    @ResponseBody
	    public List<Map<String, Object>> selectmusic() {
		 return service.music();
	    }
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectreview
	  * @return		    返回一个数据对象	
	  */	 
	 @RequestMapping("/getreview")
	    @ResponseBody
	    public List<Map<String, Object>> getreview()  {
		 return service.review();
	    }
}
