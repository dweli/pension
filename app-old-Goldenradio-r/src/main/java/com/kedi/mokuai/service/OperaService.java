package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.OperaMapper;
/**
 * 
 * @author 陈辽逊
 *
 */
@Service
public class OperaService {

	 @Autowired
	    public OperaMapper mapper;

	 public List<Map<String,Object>>opera() {
	    	return mapper.opera();
	    }	    
}
