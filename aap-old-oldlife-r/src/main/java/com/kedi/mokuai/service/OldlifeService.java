package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OldlifeMapper;

/**
 * 
 *
 * @ClassName	OldlifeService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:35
 */
@Service
public class OldlifeService {

	 @Autowired
	    public OldlifeMapper mapper;
	 
	 /**
	  * @return	返回一个养老院和床位的数据对象
	  */
	    public List<Map<String,Object>> findByName() {
	        return mapper.findByName();
	    }
	 /**
	  * @param minprice
	  * @param maxprice
	  * @return（根据minprice和maxprice返回一个数据对象）
	  */
	    public List<Map<String,Object>> oldprice(int minprice,int maxprice) {
	        return mapper.oldprice(minprice,maxprice);
	    }
	    
}
