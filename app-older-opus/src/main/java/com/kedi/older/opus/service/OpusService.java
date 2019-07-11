package com.kedi.older.opus.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


public interface OpusService {
    List<Map<String,Object>> findList();

    List<Map<String,Object>> findbyStatus(@Param("statusnum") Integer num );

    Map<String,Object> findDetail(@Param("id") Integer id );

   /* int insertopus(Map map);



    Integer insertopusource(@Param("opus_id") Integer opusid,@Param("address") String address);*/

    Integer createOpus(Map map);

}
