package com.older.welfare.service.impl;

import com.older.welfare.mapper.WelfareMapper;
import com.older.welfare.service.WelfareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WelfareServiceImpl implements WelfareService {
    @Autowired
    private WelfareMapper mapper;


    @Override
    public  List<Map<String, Object>> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public  Map<String, Object> selectAllByWelfareId(Integer id) {
        return mapper.selectAllByWelfare_id(id);
    }
}
