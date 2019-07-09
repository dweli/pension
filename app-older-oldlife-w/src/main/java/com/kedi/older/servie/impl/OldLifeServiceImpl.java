package com.kedi.older.servie.impl;

import com.kedi.older.mapper.OldLifeMapper;
import com.kedi.older.servie.OldLifeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class OldLifeServiceImpl implements OldLifeService {
    @Autowired
    private OldLifeMapper oldLifeMapper;

    @Override
    public List<Map<String, Object>> findByName() {

        return oldLifeMapper.findByName();
    }


    @Override
    public int updatePraise(@Param("id") Integer id) {

       return oldLifeMapper.updatePraise(id);
    }

    @Override
    public int updateCollection(@Param("id")  Integer id) {

       return oldLifeMapper.updateCollection(id);
    }
}
