package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.CourseRegMapper;

/**
 *
 * @ClassName	CourseRegClassService
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:48
 */
@Service
public class CourseRegClassService {

	 @Autowired
	    public CourseRegMapper mapper;
	 
	 /**
	  * @return 返回一个数据对象coursereg
	  */
	    public List<Map<String,Object>> coursereg() {
	        return mapper.coursereg();
	    }

	    
}
