package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.MusicMapper;

/**
 * 
 *
 * @ClassName	MusicService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:07
 */
@Service
public class MusicService {

	 @Autowired
	    public MusicMapper mapper;

	 /**
	  * @return 返回一个数据对象
	  */
	 public List<Map<String,Object>>music() {
	    	return mapper.music();
	    }	    
}
