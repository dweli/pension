package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.AgeNewsMapper;


/**
 * 
 *
 * @ClassName	AgeNewsService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:21
 */
@Service
public class AgeNewsService {

	 @Autowired
	    public AgeNewsMapper mapper;

	 /**
	  * @return 返回一个数据对象
	  */
	    public List<Map<String,Object>> agenews() {
	        return mapper.agenews();
	    }
}
