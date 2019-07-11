package com.kedi.older.huilaoactive.service.impl;

import com.kedi.older.huilaoactive.mapper.HuilaoactiveMapper;
import com.kedi.older.huilaoactive.service.HuilaoactiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HuilaoactiveServiceImpl implements HuilaoactiveService {
    @Autowired
    private HuilaoactiveMapper mapper;

    @Override
    public List<Map<String, Object>> findList() {
        return mapper.findList();
    }

    @Override
    public Map<String, Object> findDetail(Integer id) {
        return mapper.findDitail(id);
    }
}
