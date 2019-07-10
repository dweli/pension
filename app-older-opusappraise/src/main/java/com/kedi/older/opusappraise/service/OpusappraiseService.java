package com.kedi.older.opusappraise.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OpusappraiseService {
    List<Map<String,Object>> findList(@Param("opusid") Integer id);
}
