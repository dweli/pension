package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.MyColectionrMapper;

/**
 * 
 *
 * @ClassName	MyColectionrService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:19
 */
@Service
public class MyColectionrService {

	 @Autowired
	    public MyColectionrMapper mapper;
	 /**
	  * @param 		puserid
	  * @return		根据用户id返回一个数据对象
	  */
	 public List<Map<String,Object>>colection(int puserid) {
	    	return mapper.colection(puserid);
	    }	    
}
