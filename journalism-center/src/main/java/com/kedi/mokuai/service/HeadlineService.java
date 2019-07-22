package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.HeadlineMapper;


/**
 * 
 *
 * @ClassName	AgeNewsService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:21
 */
@Service
public class HeadlineService {

	 @Autowired
	    public HeadlineMapper mapper;
	 
	 /**
	  * @return	返回一个国内新闻数据对象
	  */
	    public List<Map<String,Object>> homenews() {
	        return mapper.homenews();
	    }
	    
	 /**
	  * @return	返回一个国际新闻数据对象
	  */
	    public List<Map<String,Object>> internationalnews() {
	        return mapper.internationalnews();
	    }	    
	   
	 /**
	  * @return	返回一个省内新闻数据对象
	  */
	    public List<Map<String,Object>> provincialnews() {
	        return mapper.provincialnews();
	    }	    
	 /**
	  * @return 返回一个老人新闻数据对象
	  */
	    public List<Map<String,Object>> agenews() {
	        return mapper.agenews();
	    }
	    
	    /**
		  * @return	返回一个国内新闻数据对象根据id
		  */
	    public Map<String,Object> homenewsDetailByid(int id) {
	        return mapper.homenewsDetailByid(id);
	    }
	    
	    /**
		  * @return	返回一个国际新闻数据对象根据id
		  */
	    public Map<String,Object> internationalnewsDetailByid(int id) {
	        return mapper.internationalnewsDetailByid(id);
	    }
	    
	    /**
		  * @return	返回一个省内新闻数据对象根据id
		  */
	    public Map<String,Object> provincialnewsDetailByid(int id) {
	        return mapper.provincialnewsDetailByid(id);
	    }
	    
	    /**
		  * @return 返回一个老人新闻数据对象根据id
		  */
	    public Map<String,Object> agenewsDetailByid(int id) {
	        return mapper.agenewsDetailByid(id);
	    }
}
