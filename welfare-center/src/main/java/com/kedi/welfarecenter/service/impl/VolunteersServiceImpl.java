package com.kedi.welfarecenter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.welfarecenter.read.dao.mapper.VolunteerMapper;
import com.kedi.welfarecenter.service.VolunteersService;
@Service
public class VolunteersServiceImpl implements VolunteersService{
	@Autowired
	VolunteerMapper volunteerMapper;
	@Override
	public List<Map> getJobVolunteerList() {
		return volunteerMapper.findList();
	}

	@Override
	public Map getVolunteerDetail(Integer id) {
		return volunteerMapper.findDitail(id);
	}

}
