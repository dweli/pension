package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OldhealthMapper;
/**
 * 
 * @author 陈辽逊
 *
 */
@Service
public class OldhealthService {

	 @Autowired
	    public OldhealthMapper mapper;

	  /*  public List<Map<String,Object>> findByName() {
	        return mapper.findByName();
	    }
	    
	    public List<Map<String,Object>> oldprice(int minprice,int maxprice) {
	        return mapper.oldprice(minprice,maxprice);
	    }*/
	    
	    public List<Map<String,Object>> olduserid(int olduserid) {
	        return mapper.olduserid(olduserid);
	    }

}
