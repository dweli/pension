package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OldhomeMapper;
/**
 * 
 * @author 陈辽逊
 *
 */
@Service
public class OldhomeService {

	 @Autowired
	    public OldhomeMapper mapper;

	    /*public List<Map<String,Object>>business(int puserid) {
	    	return mapper.business(puserid);
	    }
	    public List<Map<String,Object>>commodity(int puserid) {
	    	return mapper.commodity(puserid);
	    }
	    */
	 
	 public List<Map<String,Object>>commodity() {
	    	return mapper.commodity();
	    }	    
}
