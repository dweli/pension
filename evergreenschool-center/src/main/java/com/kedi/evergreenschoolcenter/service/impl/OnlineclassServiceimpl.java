package com.kedi.evergreenschoolcenter.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.evergreenschoolcenter.read.dao.mapper.OnlineClassMapper;
import com.kedi.evergreenschoolcenter.service.OnlineclassService;



/**
 *
 * @ClassName	onlineclassService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:42
 */
@Service
public class OnlineclassServiceimpl implements OnlineclassService{
	
	
	 @Autowired
	    public OnlineClassMapper mapper;
	 /**
	  * @return	返回一个online数据对象
	  */
	    public List<Map<String,Object>> online(int cal) {
	        return mapper.online(cal);
	    }
	   
	 /**
	  * @return 返回一个calss数据对象
	  */
	    public List<Map<String,Object>> calss() {
	        return mapper.calss();
	    }
}
