package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.HeadlineService;


/**
 * 
* @Description: 每日头条控制层
* @author: clx 
* @date: 2019 2019年7月11日 下午15:35:59
 */
@Controller
public class HeadlineController {
	
	 @Autowired
	    public HeadlineService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selecthomenews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/getHomeNews")
	    @ResponseBody
	    public List<Map<String, Object>> getHomeNews() {
	        return	service.homenews();
	    } 
	 
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectinternationalnews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/getInternationnalNews")
	    @ResponseBody
	    public List<Map<String, Object>> getInternationnalNews() {
	    	return service.internationalnews();	        
	    }	    
	 
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectprovincialnews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/getProvincialNews")
	    @ResponseBody
	    public List<Map<String, Object>> getProvincialNews() {
	    	return service.provincialnews();
	    }   
	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectagenews
	  * @return		    返回一个数据对象	
	  */
	    @RequestMapping("/getAgeNews")
	    @ResponseBody
	    public List<Map<String, Object>> getAgeNews() {
	    	return service.agenews();
	    }
	    
	    /**
		  * @Description: 获取国内新闻根据id
		  * @return		    返回一个数据对象	
		  */
	    @RequestMapping("/getHomeNewsbyid")
	    @ResponseBody
	    public Map<String, Object> getHomeNewsByid(int id) {
	        return	service.homenewsDetailByid(id);
	    }
	    
	    /**
		  * @Description: 获取国际新闻byid
		  * @return		    返回一个数据对象	
		  */
	    @RequestMapping("/getInternationnalNewsbyid")
	    @ResponseBody
	    public Map<String, Object> getInternationnalNewsByid(int id) {
	    	return service.internationalnewsDetailByid(id);	        
	    }
	    
	    /**
		  * @Description: 获取省内新闻byid
		  * @return		    返回一个数据对象	
		  */
	    @RequestMapping("/getProvincialNewsbyid")
	    @ResponseBody
	    public Map<String, Object> getProvincialNewsByid(int id) {
	    	return service.provincialnewsDetailByid(id);
	    }
	    
	    /**
		  * @Description: 获取老年新闻根据id
		  * @return		    返回一个数据对象	
		  */
	    @RequestMapping("/getAgeNewsbyid")
	    @ResponseBody
	    public Map<String, Object> getAgeNewsByid(int id) {
	    	return service.agenewsDetailByid(id);
	    }

}
