package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OldlifeMapper;
/**
 * @version:		1.0
 * @Description: （对类进行功能描述
 * @author: 		陈辽逊
 * @date: 			2019-7-8 10:55
 */
@Service
public class OldlifeService {

	 @Autowired
	    public OldlifeMapper mapper;

	    public List<Map<String,Object>> findByName() {
	        return mapper.findByName();
	    }
	    
	    public List<Map<String,Object>> oldprice(int minprice,int maxprice) {
	        return mapper.oldprice(minprice,maxprice);
	    }
	    
}
