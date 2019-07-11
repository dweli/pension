package com.older.welfare.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface WelfareMapper {
    /*@Insert("insert into welfare (name,price,givetime,uploadtime,older_idcard,older_name,giveusername,giveuseridcard) " +
            "VALUES(${name},#{price},now(),now(),${olderIdcard},${olderName},\n" +
            "${giveusename},${giveUseriDcard})")
    Integer insert(@Param("name") String name,@Param("price")Integer price
            ,@Param("olderIdcard") String olderIdcard,@Param("olderName") String olderName,@Param("giveusename" )String giveusemame,@Param("giveUseriDcard")String giveUseriDcard);*/

   @Select("SELECT welfare_id,name,price,givetime,uploadtime,older_idcard,older_name,giveusername,giveuseridcard from welfare")
   List<Map<String, Object>> selectAll();

    @Select("SELECT welfare_id,name,price,givetime,uploadtime,older_idcard,older_name,giveusername,giveuseridcard from welfare where welfare_id=#{id}")
    Map<String, Object> selectAllByWelfare_id(@Param("id") Integer id );
}
