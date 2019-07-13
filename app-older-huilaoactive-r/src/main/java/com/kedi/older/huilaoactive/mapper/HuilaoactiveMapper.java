package com.kedi.older.huilaoactive.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface HuilaoactiveMapper {
    @Select("select huilaoactive.active_id , title,huilaoimage.address from huilaoactive left join huilaoimage on huilaoimage.active_id=huilaoactive.active_id")
    List<Map<String,Object>> findList();

    @Select("select huilaoactive.active_id , title,huilaoimage.address,content,activetheme,activetime,eventslogans,phone,contacts,email from huilaoactive left join\n" +
            " huilaoimage on huilaoimage.active_id=huilaoactive.active_id where huilaoactive.active_id=#{id}")
    Map<String,Object> findDitail(@Param("id") Integer id);
}
