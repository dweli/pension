package com.kedi.older.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface Othersource {
	
  @Insert("INSERT INTO `Pension`.`other_source` (`title`,`content`,`url`,`phone`,`status`,`source_class`) "+ 
		     " VALUES (#{map.title},#{map.content},#{map.url},#{map.phone},#{map.status},#{map.source_class})")
  int insertOthersource(@Param("map")Map map);
  
  @Update("UPDATE `Pension`.`other_source` t  SET t.`title`= CASE WHEN #{map.title} IS NULL THEN t.`title` ELSE #{map.title} END,"
  +" t.`content`= CASE WHEN #{map.content} IS NULL THEN t.`content` ELSE #{map.content} END, "
  +" t.`url`= CASE WHEN #{map.url} IS NULL THEN t.`url` ELSE #{map.url} END, "
  +" t.`phone`= CASE WHEN #{map.phone} IS NULL THEN t.`phone` ELSE #{map.phone} END, "
  +" t.`status`= CASE WHEN #{map.status} IS NULL THEN t.`status` ELSE #{map.status} END "
  +" WHERE t.`other_source_id`= #{map.other_source_id}")
  int updateOthersourceByNotNull(@Param("map")Map map);
  
  @Update("UPDATE other_source t  SET t.`status` =0 WHERE t.`other_source_id`=#{id}")
  int deleteOthersource(@Param("id")int id);
}
