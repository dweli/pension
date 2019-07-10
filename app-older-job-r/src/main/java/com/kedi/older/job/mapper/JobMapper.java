package com.kedi.older.job.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface JobMapper {

    @Select("select job_id,price,job.p_user_id,positon,salaryrange,paymethod,lon_lat,workAddress,name " +
            "from user left join job on user.p_user_id=job.p_user_id where job.job_id is not null")
    List<Map<String,Object>> findList();

    @Select("select p_user_id,price,positon,salaryrange,paymethod,hiring_num,education,experience,workAddress,describle from job where job_id=#{id}")
    Map<String,Object> findDetail(@Param("id") Integer id );
}
