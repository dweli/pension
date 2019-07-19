package com.kedi.welfarecenter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.welfarecenter.read.dao.mapper.WelfareMapper;
import com.kedi.welfarecenter.service.CivilWelfareService;
@Service
public class CivilWelfareServiceImpl implements CivilWelfareService {
	@Autowired
	WelfareMapper welfareMapper;
	@Override
	public List<Map<String,Object>> getCivilWelfareList() {
		return welfareMapper.selectAll();
	}

	@Override
	public Map getCivilWelfareDetail(Integer id) {
		return welfareMapper.selectAllByWelfare_id(id);
	}

}
