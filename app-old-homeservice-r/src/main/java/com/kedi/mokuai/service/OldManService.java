package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kedi.mokuai.dao.OldManMapper;


/**
 * 
 *
 * @ClassName	OldhomeService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:13
 */
@Service
public class OldManService {

	 @Autowired
	    public OldManMapper mapper;

	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>classname(String name) {
	    	return mapper.classname(name);
	    }	    
	 
	 /**
	  * @return	返回一个数据对象
	  */
	 public int business(Map map) {
		 
		 return mapper.business(map);
	 }	    
	 
	 
	 /**
	  * @return	返回一个数据对象
	  */
	 @Transactional
	 public boolean merchant(Map map) {
		int a= mapper.state(map);
		 int b=mapper.merchant(map);
		 if(a==1&&b==1) {
			 return true;
		 }else {
			 return true; 
		 }
		
	 }	    
}
