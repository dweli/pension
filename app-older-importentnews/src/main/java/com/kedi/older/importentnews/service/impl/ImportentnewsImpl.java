package com.kedi.older.importentnews.service.impl;

import com.kedi.older.importentnews.mapper.ImportentnewsMapper;
import com.kedi.older.importentnews.service.ImportentnewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ImportentnewsImpl implements ImportentnewsService {
    @Autowired
    private ImportentnewsMapper mapper;

    @Override
    public List<Map<String, Object>> findList() {
        return mapper.findList();
    }

    @Override
    public List<Map<String, Object>> findOne(Integer id) {
        return mapper.findOne(id);
    }
}
