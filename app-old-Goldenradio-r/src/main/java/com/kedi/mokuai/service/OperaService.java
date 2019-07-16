package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OperaMapper;

/**
 * 
 *
 * @ClassName	OperaService
 * @author: 	陈辽逊
 * @date: 		2019/713 11:06
 */
@Service
public class OperaService {

	 @Autowired
	    public OperaMapper mapper;

	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>opera() {
	    	return mapper.opera();
	    }	    
}
