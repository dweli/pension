package com.kedi.older.servie.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kedi.older.mapper.SubscribeMapper;
import com.kedi.older.servie.SubscribeService;
@Service
public class SubscribeServiceImpl implements SubscribeService {
	
	@Autowired
	SubscribeMapper subscribeMapper;

	@Override
	@Transactional
	public String creatSubscribe(List<Map> list) {
		String success="success";
		for(Map map:list){
		 	int subscribe = subscribeMapper.insertSubscribe(map); 
		 	if(subscribe!=1){success="false";}
		}
		return success;
	}

}
