package com.kedi.welfarecenter.read.dao.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface VolunteerMapper {

    @Select("select volunteer,title,status,post,specifictime from volunteer")
    List<Map> findList();

    @Select("select title,content,start_time,end_time,i.address,phone,enlist,enrequire,v.address as volunteeraddress,specifictime from volunteer v left join\n" +
            " imagesource i on i.volunteer = v.volunteer where v.volunteer=#{id}")
    Map<String,Object> findDitail(@Param("id") Integer id);

}
