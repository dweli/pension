package com.kedi.homeservicecenter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.homeservicecenter.read.dao.mapper.OldhomeMapper;
import com.kedi.homeservicecenter.service.HomeServiceCenterService;
@Service
public class HomeServiceCenterServiceImpl implements HomeServiceCenterService{
	@Autowired
	OldhomeMapper oldhomeMapper;
	@Override
	public List<Map> selectBusinessCommodity() {
		return oldhomeMapper.commodity();
	}

	@Override
	public Map<String, Object> getCommodityDetailbyid(Integer id) {
		return oldhomeMapper.getCommodityDetailbyid(id);
	}

}
