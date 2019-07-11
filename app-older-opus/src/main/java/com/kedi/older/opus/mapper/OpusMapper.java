package com.kedi.older.opus.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface OpusMapper {
    @Select("select opus.opus_id,opus.p_user_id,opus.name as opusname,status,price,opusource.address as imageaddress,user.name as username ,opus.pricenum,opus.collectionnum from \n" +
            "(opus left join user on opus.p_user_id=user.p_user_id)left join opusource on opus.opus_id=opusource.opus_id\n")
    List<Map<String,Object>> findList();

    @Select("select opus.opus_id,opus.p_user_id,opus.name as opusname,status,price,opusource.address as imageaddress,user.name as username ,opus.pricenum,opus.collectionnum from \n" +
            "(opus left join user on opus.p_user_id=user.p_user_id)left join opusource on opus.opus_id=opusource.opus_id where opus.status=#{statusnum}")
    List<Map<String,Object>> findbyStatus(@Param("statusnum") Integer num );

    @Select("select opus.p_user_id as opus_p_user_id,opus.name as opusname ,status,price,weight,\n" +
            "uploadDate,uploadUser,saletime,opus.pricenum,opus.collectionnum,opusource.address as imageaddress from opus left join \n" +
            "opusource on opus.opus_id=opusource.opus_id  where opus.opus_id=#{id}")
    Map<String,Object> findDetail(@Param("id") Integer id );


/*
   @Insert("insert into opus(p_user_id,name,price,weight,uploadUser,status,uploadDate) values(#{p_user_id},${name},#{price},#{weight},#{uploadUser},1,CURTIME())")
   @Options(useGeneratedKeys = true, keyProperty = "opus_id")
   int insertopus(@Param("p_user_id") Integer puserid,@Param("name") String name,@Param("price") Integer price,
                       @Param("weight") Float weight,@Param("uploadUser") Integer uploadUser);*/

    int insertopus(Map map);

    @Insert("insert into opusource(opus_id,address,width,height) values(#{opus_id},${address},0,0)")
    Integer insertopusource(Map map);
}
