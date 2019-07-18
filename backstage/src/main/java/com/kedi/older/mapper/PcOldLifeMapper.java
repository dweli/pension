package com.kedi.older.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 
 *
 * @ClassName	PcOldLifeMapper
 * @author: 	陈辽逊
 * @date: 		2019/7/17 15:47
 */
@Mapper
public interface PcOldLifeMapper {
 
	/**
	 * @Description:	获取预约床位列表部分信息
	 * @param 			part
	 * @return			返回一个封装的数据对象oldlifepart
	 */
	@Select("SELECT bedNumsber,price,status,p_user_id,name,address " 
			 +"FROM bed_oldlife")
	List<Map<String, Object>> oldlifepart();
	/**
	 * @Description:	获取预约床位详情信息
	 * @param 			oldlifeid
	 * @return			返回一个封装的数据对象oldall
	 */
	@Select("SELECT oldlife_id,bedNumsber,price,minPrice,maxPrice, " 
			 +"`status`,p_user_id,`name`,address,phone, " 
			 +"CONVERT (`Introduction`  USING utf8) AS Introduction, " 
			 +"praise_points,collection_num,url  "  
			 +"FROM bed_oldlife  " 
			 +"WHERE oldlife_id =(#{oldlifeid})")
	List<Map<String, Object>> oldlifeall(@Param("oldlifeid")int oldlifeid);


	/**
	 * @Description:	创建养老院相关信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Insert("INSERT oldlife "  
			 +"(p_user_id,name,address,phone,Introduction,url) " 
			 +"VALUE " 
			 +"((#{map.puserid}),(#{map.name}),(#{map.address}),(#{map.phone}),(#{map.Introduction}),(#{map.url}))")
	int ioldlife(@Param("map")Map map);
	/**
	 * @Description:	创建床位相关信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Insert("INSERT bed "   
			+"(oldlife_id,bedNumsber,price,minPrice,maxPrice,status) "   
			+"VALUE "   
			+"((#{map.oldlifeid}),(#{map.bedNumsber}),(#{map.price}),(#{map.minPrice}),(#{map.maxPrice}),(#{map.status}))")
	int ibed(@Param("map")Map map);
	/**
	 * @Description:	修改床位相关信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Update("UPDATE bed "  
			+"SET  "  
			+"oldlife_id = (CASE WHEN (#{map.oldlifeid}) IS NULL THEN oldlife_id ELSE (#{map.oldlifeid}) END),"  
			+"bedNumsber =  (CASE WHEN (#{map.bedNumsber}) IS NULL THEN bedNumsber ELSE (#{map.bedNumsber}) END),"  
			+"price = (CASE WHEN (#{map.price}) IS NULL THEN price ELSE (#{map.price}) END),"  
			+"minPrice = (CASE WHEN (#{map.minPrice}) IS NULL THEN minPrice ELSE (#{map.minPrice}) END),"  
			+"maxPrice = (CASE WHEN (#{map.maxPrice}) IS NULL THEN maxPrice ELSE (#{map.maxPrice}) END),"  
			+"status = (CASE WHEN (#{map.status}) IS NULL THEN status ELSE (#{map.status}) END) "  
			+"WHERE oldlife_id = (#{map.oldlifeid})")
	int bed(@Param("map")Map map);
	/**
	 * @Description:	修改养老院相关信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Update("UPDATE oldlife "  
			 +"SET "  
			 +"p_user_id = (CASE WHEN (#{map.puserid}) IS NULL THEN p_user_id ELSE (#{map.puserid}) END),"  
			 +"name =  (CASE WHEN (#{map.name}) IS NULL THEN name ELSE (#{map.name}) END),"  
			 +"address = (CASE WHEN (#{map.address}) IS NULL THEN address ELSE (#{map.address}) END),"  
			 +"phone = (CASE WHEN (#{map.phone}) IS NULL THEN phone ELSE (#{map.phone}) END)," 
			 +"Introduction = (CASE WHEN (#{map.Introduction}) IS NULL THEN Introduction ELSE (#{map.Introduction}) END)," 
			 +"url = (CASE WHEN (#{map.url}) IS NULL THEN url ELSE (#{map.url}) END) "  
			 +"WHERE oldlife_id = (#{map.oldlifeid})")
	int oldlife(@Param("map")Map map);
}
