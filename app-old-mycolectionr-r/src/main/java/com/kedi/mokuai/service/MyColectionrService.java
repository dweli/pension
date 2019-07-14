package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.MyColectionrMapper;
/**
 * 
 * @author 陈辽逊
 *
 */
@Service
public class MyColectionrService {

	 @Autowired
	    public MyColectionrMapper mapper;
	 
	 public List<Map<String,Object>>colection(int puserid) {
	    	return mapper.colection(puserid);
	    }	    
}
