package com.kedi.evergreenschoolcenter.service.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.evergreenschoolcenter.read.dao.mapper.CommunitysalonMapper;
import com.kedi.evergreenschoolcenter.service.CommunitysalonService;



/**
 * 
 *
 * @ClassName	CommunitysalonService
 * @author: 	陈辽逊
 * @date: 		2019/713 10:49
 */
@Service
public class CommunitysalonServiceImpl implements CommunitysalonService {

	 @Autowired
	    public CommunitysalonMapper mapper;

	 /**
	  * @return 返回一个数据对象communitysalon
	  */
	    public List<Map<String,Object>> communitysalon() {
	        return mapper.communitysalon();
	    }
	    
}
