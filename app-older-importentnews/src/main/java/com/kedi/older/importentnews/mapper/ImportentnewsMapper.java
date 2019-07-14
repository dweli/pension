package com.kedi.older.importentnews.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ImportentnewsMapper {

    @Select("select i.content,i.newstime,i.url from importentnews i left join user on i.p_user_id = user.p_user_id where user.p_user_id=#{id}")
    List<Map<String, Object>> findOne(@Param("id") Integer id );

    @Select("select i.content,i.newstime,i.url from importentnews i")
    List<Map<String,Object>> findList();
}
