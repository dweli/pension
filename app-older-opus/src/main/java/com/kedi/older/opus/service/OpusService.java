package com.kedi.older.opus.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OpusService {
    List<Map<String,Object>> findList();

    List<Map<String,Object>> findbyStatus(@Param("statusnum") Integer num );

    Map<String,Object> findDetail(@Param("id") Integer id );

    Integer insertopus(@Param("p_user_id") Integer puserid,@Param("name") String name,@Param("price") Integer price,
                       @Param("weight") Float weight,@Param("uploadUser") Integer uploadUser);

    Integer insertopusource(@Param("opus_id") Integer opusid,@Param("address") String address);
}
