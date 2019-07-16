package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OtherSourceMapper;

/**
 * 
 *
 * @ClassName	OtherSourceService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:40
 */
@Service
public class OtherSourceService {

	 @Autowired
	    public OtherSourceMapper mapper;
	 
	 /**
	  * @return	返回一个数据对象
	  */
	    public List<Map<String,Object>> othersource() {
	        return mapper.othersource();
	    }
	    
	    public int insertOthersource(Map map) {
	    	return mapper.insertOthersource(map);
	    }
}
