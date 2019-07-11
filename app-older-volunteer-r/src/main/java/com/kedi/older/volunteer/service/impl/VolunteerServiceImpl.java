package com.kedi.older.volunteer.service.impl;

import com.kedi.older.volunteer.mapper.VolunteerMapper;
import com.kedi.older.volunteer.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VolunteerServiceImpl implements VolunteerService {
    @Autowired
    private VolunteerMapper mapper;

    @Override
    public List<Map<String, Object>> findList() {
        return mapper.findList();
    }

    @Override
    public Map<String, Object> findDetail(Integer id) {
        return mapper.findDitail(id);
    }
}
