package com.older.welfare.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface WelfareService {

    List<Map<String, Object>> selectAll();
    List<Map<String, Object>> selectAllByWelfareId(@Param("id") Integer id );
}
