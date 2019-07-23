package com.kedi.usercenter.service;


import com.kedi.usercenter.mapper.MyColectionrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
