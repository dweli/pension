package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.mokuai.dao.CourseRegMapper;

/**
 * @version:		1.0
 * @Description: （对类进行功能描述
 * @author: 		陈辽逊
 * @date: 			2019-7-8 10:55
 */
@Service
public class CourseRegClassService {

	 @Autowired
	    public CourseRegMapper mapper;

	    public List<Map<String,Object>> coursereg() {
	        return mapper.coursereg();
	    }

	    
}
