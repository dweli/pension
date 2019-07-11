package com.kedi.older.opus.service.impl;

import com.kedi.older.opus.mapper.OpusMapper;
import com.kedi.older.opus.service.OpusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

/*    @Transactional
    public int insertopus(Map map) {
        return mapper.insertopus(map);
    }*/

/*    @Override
    public List<Map<String, Object>> findAll() {
        return mapper.findAll();
    }*/

   /* @Transactional
    public Integer insertopusource(Integer opusid, String address) {
        return mapper.insertopusource(opusid,address);
}
*/
    @Override
    public Integer createOpus(Map map) {
        int insertopus = mapper.insertopus(map);
        return    mapper.insertopusource(map);

    }


}
