package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.ReviewMapper;
/**
 * 
 * @author 陈辽逊
 *
 */
@Service
public class ReviewService {

	 @Autowired
	    public ReviewMapper mapper;

	 public List<Map<String,Object>>review() {
	    	return mapper.review();
	    }	    
}
