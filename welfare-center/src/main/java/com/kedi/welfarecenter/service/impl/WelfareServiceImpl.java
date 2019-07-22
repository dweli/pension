package com.kedi.welfarecenter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.welfarecenter.read.dao.mapper.JobMapper;
import com.kedi.welfarecenter.service.WelfareService;
@Service
public class WelfareServiceImpl implements WelfareService {
	@Autowired
	JobMapper jobMapper;
	
	@Override
	public List<Map> getJobList() {
		return jobMapper.findList();
	}

	@Override
	public Map getJobDetail(Integer id) {
		return jobMapper.findDetail(id);
	}

}
