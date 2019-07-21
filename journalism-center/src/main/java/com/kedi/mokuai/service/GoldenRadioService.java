package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.GoldenRadioMapper;

/**
 * 
 *
 * @ClassName	StorytellingService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:08
 */
@Service
public class GoldenRadioService {

	 @Autowired
	    public GoldenRadioMapper mapper;

	 /**
	  * @return	返回一个评书数据对象
	  */
	 public List<Map<String,Object>>storytelling() {
	    	return mapper.storytelling();
	    }
	 
	 /**
	  * @return	返回一个戏曲数据对象
	  */
	 public List<Map<String,Object>>opera() {
	    	return mapper.opera();
	    }
	 /**
	  * @return 返回一个音乐数据对象
	  */
	 public List<Map<String,Object>>music() {
	    	return mapper.music();
	    }	 
	 /**
	  * @return 返回一个实评数据对象
	  */
	 public List<Map<String,Object>>review() {
	    	return mapper.review();
	    }	
}
