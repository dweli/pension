package com.kedi.older.job.service.impl;

import com.kedi.older.job.mapper.JobMapper;
import com.kedi.older.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
   private JobMapper jobMapper;

    @Override
    public List<Map<String, Object>> findList() {
        return jobMapper.findList();
    }

    @Override
    public Map<String, Object> findDetail(Integer id) {
        return jobMapper.findDetail(id);
    }
}
