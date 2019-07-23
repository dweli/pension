package com.kedi.healthcenter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.healthcenter.read.dao.mapper.OldlifeMapper;
import com.kedi.healthcenter.service.OldlifeService;


@Service
public class OldlifeServiceImpl implements OldlifeService {
	
	@Autowired
	OldlifeMapper oldlifeMapper;
	/**
	 *  查询全部床位信息
	 */
	@Override
	public List<Map<String, Object>> findBedList() {
		
		return oldlifeMapper.findBedList();
	}
	/**
	 * 根据价格返回床位信息
	 */
	@Override
	public List<Map<String, Object>> oldprice(int minprice, int maxprice) {
		
		return oldlifeMapper.oldprice(minprice, maxprice);
	}

}
