package com.kedi.older.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface OpusMapper {
   
	@Insert("INSERT INTO `Pension`.`opus` (`p_user_id`,`name`,`status`,`price`,`weight`,`uploadDate`,`uploadUser`,`saletime`,`pricenum`,`collectionnum`,`online_status`)" 
   +" VALUES(#{map.p_user_id},#{map.name},#{map.status}, #{map.price},#{map.weight},#{map.uploadDate},#{map.uploadUser},#{map.saletime},#{map.pricenum},#{map.collectionnum},#{map.online_status}) ")
    int insertOpus(@Param("map")Map map);
 
	 @Update("UPDATE `Pension`.`opus` t  SET t.`p_user_id`= CASE WHEN #{map.p_user_id} IS NULL THEN t.`p_user_id` ELSE #{map.p_user_id} END,"
	 +" t.`name`= CASE WHEN #{map.name} IS NULL THEN t.`name` ELSE #{map.name} END, "
	 +" t.`status`= CASE WHEN #{map.status} IS NULL THEN t.`status` ELSE #{map.status} END, "
	 +" t.`price`= CASE WHEN #{map.price} IS NULL THEN t.`price` ELSE #{map.price} END, "
	 +" t.`weight`= CASE WHEN #{map.weight} IS NULL THEN t.`weight` ELSE #{map.weight} END, "
	 +" t.`weight`= CASE WHEN #{map.weight} IS NULL THEN t.`weight` ELSE #{map.weight} END, "
	 +" t.`uploadDate`= CASE WHEN #{map.uploadDate} IS NULL THEN t.`uploadDate` ELSE #{map.uploadDate} END, "
	 +" t.`uploadUser`= CASE WHEN #{map.uploadUser} IS NULL THEN t.`uploadUser` ELSE #{map.uploadUser} END, "
	 +" t.`saletime`= CASE WHEN #{map.saletime} IS NULL THEN t.`saletime` ELSE #{map.saletime} END, "
	 +" t.`pricenum`= CASE WHEN #{map.pricenum} IS NULL THEN t.`pricenum` ELSE #{map.pricenum} END, "
	 +" t.`collectionnum`= CASE WHEN #{map.collectionnum} IS NULL THEN t.`collectionnum` ELSE #{map.collectionnum} END, "
	 +" t.`online_status`= CASE WHEN #{map.online_status} IS NULL THEN t.`online_status` ELSE #{map.online_status} END "
	 +" WHERE t.`opus_id`= #{map.opus_id}")
	 int updateOpusByNotNull(@Param("map")Map map);
	 
	 @Update("UPDATE `Pension`.`opus` t  SET t.`online_status` =0 WHERE t.`opus_id`=#{opus_id}")
	 int deleteOpus(@Param("opus_id")int opus_id);
}
