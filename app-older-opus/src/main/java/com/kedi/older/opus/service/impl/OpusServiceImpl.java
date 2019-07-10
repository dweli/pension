package com.kedi.older.opus.service.impl;

import com.kedi.older.opus.mapper.OpusMapper;
import com.kedi.older.opus.service.OpusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OpusServiceImpl implements OpusService {
    @Autowired
    private OpusMapper mapper;

    @Override
    public List<Map<String, Object>> findList() {
        return mapper.findList();
    }

    @Override
    public List<Map<String, Object>> findbyStatus(Integer num) {
        return mapper.findbyStatus(num);
    }

    @Override
    public Map<String, Object> findDetail(Integer id) {
        return mapper.findDetail(id);
    }

    @Override
    public int insertopus(Map map) {
        return mapper.insertopus(map);
    }

/*    @Override
    public int insertopus(Integer puserid, String name, Integer price, Float weight, Integer uploadUser) {
        int integer = mapper.insertopus(puserid, name, price, weight, uploadUser);
        return integer;
    }*/


    @Override
    public Integer insertopusource(Integer opusid, String address) {
        return mapper.insertopusource(opusid,address);
}


}
