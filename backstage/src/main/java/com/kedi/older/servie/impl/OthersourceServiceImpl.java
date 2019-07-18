package com.kedi.older.servie.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.older.mapper.Othersource;
import com.kedi.older.servie.OthersourceService;
@Service
public class OthersourceServiceImpl implements OthersourceService {
	@Autowired
	Othersource othersourceMapper;

	@Override
	public int insertOthersource(Map map) {
		return othersourceMapper.insertOthersource(map);
	}

	@Override
	public int updateOthersourceByNotNull(Map map) {
		// TODO Auto-generated method stub
		return othersourceMapper.updateOthersourceByNotNull(map);
	}

	@Override
	public int deleteOthersource(int id) {
		
		return othersourceMapper.deleteOthersource(id);
	}

}
