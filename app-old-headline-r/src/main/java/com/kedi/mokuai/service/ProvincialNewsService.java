package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.ProvincialNewsMapper;

/**
 * 
 *
 * @ClassName	ProvincialNewsService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:24
 */
@Service
public class ProvincialNewsService {

	 @Autowired
	    public ProvincialNewsMapper mapper;

	 /**
	  * @return	返回一个数据对象
	  */
	    public List<Map<String,Object>> provincialnews() {
	        return mapper.provincialnews();
	    }
}
