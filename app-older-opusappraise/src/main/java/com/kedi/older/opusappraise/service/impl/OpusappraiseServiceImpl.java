package com.kedi.older.opusappraise.service.impl;

import com.kedi.older.opusappraise.mapper.OpusappraiseMapper;
import com.kedi.older.opusappraise.service.OpusappraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OpusappraiseServiceImpl implements OpusappraiseService {
    @Autowired
    private OpusappraiseMapper mapper;

    @Override
    public List<Map<String, Object>> findList(Integer id) {
        return mapper.findList(id);
    }
}
