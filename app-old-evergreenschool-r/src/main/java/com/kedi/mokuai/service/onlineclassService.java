package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OnlineClassMapper;

/**
 *
 * @ClassName	onlineclassService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:42
 */
@Service
public class onlineclassService {
	
	
	 @Autowired
	    public OnlineClassMapper mapper;
	 /**
	  * @return	返回一个online数据对象
	  */
	    public List<Map<String,Object>> online(int calss) {
	        return mapper.online(calss);
	    }
	   
	 /**
	  * @return 返回一个calss数据对象
	  */
	    public List<Map<String,Object>> calss() {
	        return mapper.calss();
	    }
}
