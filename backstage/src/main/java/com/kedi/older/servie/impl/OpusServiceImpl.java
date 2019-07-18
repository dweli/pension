package com.kedi.older.servie.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.older.mapper.OpusMapper;
import com.kedi.older.servie.OpusService;
@Service
public class OpusServiceImpl implements OpusService{
	
	@Autowired
	OpusMapper opusMapper;
	
	@Override
	public int insertOpus(Map map) {
		return opusMapper.insertOpus(map);
	}

	@Override
	public int updateOpusByNotNull(Map map) {
		return opusMapper.updateOpusByNotNull(map);
	}

	@Override
	public int deleteOpus(int id) {
		return opusMapper.deleteOpus(id);
	}

}
