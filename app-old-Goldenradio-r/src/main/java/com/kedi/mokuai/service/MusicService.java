package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.MusicMapper;
/**
 * 
 * @author 陈辽逊
 *
 */
@Service
public class MusicService {

	 @Autowired
	    public MusicMapper mapper;

	 public List<Map<String,Object>>music() {
	    	return mapper.music();
	    }	    
}
