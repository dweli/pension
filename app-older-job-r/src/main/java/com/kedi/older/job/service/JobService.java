package com.kedi.older.job.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface JobService {
    List<Map<String,Object>> findList();
    Map<String,Object> findDetail(@Param("id") Integer id );
}
