package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.StorytellingMapper;
/**
 * 
 * @author 陈辽逊
 *
 */
@Service
public class StorytellingService {

	 @Autowired
	    public StorytellingMapper mapper;

	 public List<Map<String,Object>>storytelling() {
	    	return mapper.storytelling();
	    }	    
}
