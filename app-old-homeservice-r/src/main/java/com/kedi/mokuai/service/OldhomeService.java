package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OldhomeMapper;

/**
 * 
 *
 * @ClassName	OldhomeService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:13
 */
@Service
public class OldhomeService {

	 @Autowired
	    public OldhomeMapper mapper;

	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>commodity() {
	    	return mapper.commodity();
	    }	    
	 /**
	  * @return	返回一个商品
	  */
	 public Map<String,Object> getCommodityDetailbyid(int id) {
		 return mapper.getCommodityDetailbyid(id);
	 }	    
}
