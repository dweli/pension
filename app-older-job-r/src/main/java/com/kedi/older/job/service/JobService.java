package com.kedi.older.job.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* 方法实现说明  长者就业servcie层
* @author      ytw
*@param
* @return
* @exception
* @date        2019/7/12 9:44
*/
public interface JobService {
    List<Map<String,Object>> findList();
    Map<String,Object> findDetail(@Param("id") Integer id );
}
