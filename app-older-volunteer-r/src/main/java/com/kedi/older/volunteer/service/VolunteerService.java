package com.kedi.older.volunteer.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface VolunteerService {
    List<Map<String,Object>> findList();
    Map<String,Object> findDetail(@Param("id") Integer id );
}
