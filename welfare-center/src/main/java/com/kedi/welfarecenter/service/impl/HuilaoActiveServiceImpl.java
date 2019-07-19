package com.kedi.welfarecenter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.welfarecenter.read.dao.mapper.HuilaoactiveMapper;
import com.kedi.welfarecenter.service.HuilaoActiveService;
@Service
public class HuilaoActiveServiceImpl implements HuilaoActiveService{
    @Autowired
	HuilaoactiveMapper huilaoactiveMapper;
	@Override
	public List<Map<String,Object>> getHuilaoActiveList() {
		return huilaoactiveMapper.findList();
	}

	@Override
	public Map getHuilaoActiveDetail(Integer id) {
		return huilaoactiveMapper.findDitail(id);
	}

}
