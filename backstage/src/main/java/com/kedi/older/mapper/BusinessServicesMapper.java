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
 * @ClassName	OldhomeMapper
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:10
 */
@Mapper
public interface BusinessServicesMapper {
	
	/**
	 * @Description:	获取商家信息表的所有数据
	 * @return			返回一个封装的数据对象commodity
	 */
	@Select("SELECT  * " 
			+"FROM business	b " 
			+"LEFT JOIN businessclass c " 
			+"ON b.businessclass_id = c.businessclass_id " 
			+"WHERE classname = (#{classname})")
	List<Map<String, Object>> classname(@Param("classname")String classname);
	
	/**
	 * @Description:	根据商家id 更新
	 * @param puserid
	 * @param name
	 * @param address
	 * @param phone
	 * @param likenum
	 * @param collectnum
	 * @param businessclassid
	 * @return（展示方法参数和返回值）
	 */
	@Update("UPDATE business " 
			+"SET p_user_id = (CASE WHEN (#{map.puserid}) IS NULL THEN p_user_id ELSE (#{map.puserid}) END)," 
			+"name = (CASE WHEN (#{map.name}) IS NULL THEN name ELSE (#{map.name}) END), " 
			+"address = (CASE WHEN (#{map.address}) IS NULL THEN address ELSE (#{map.address}) END)," 
			+"phone = (CASE WHEN (#{map.phone}) IS NULL THEN phone ELSE (#{map.phone}) END)," 
			+"like_num = (CASE WHEN (#{map.likenum}) IS NULL THEN like_num ELSE (#{map.likenum}) END)," 
			+"collect_num = (CASE WHEN (#{map.collectnum}) IS NULL THEN like_num ELSE (#{map.collectnum}) END),"
			+"businessclass_id = (CASE WHEN (#{map.businessclassid}) IS NULL THEN businessclass_id ELSE (#{map.businessclassid}) END) "
			+"WHERE business_id = (#{map.businessid});")
	 int business(@Param("map")Map map);
	/**
	 * @Description:	创建商家类型
	 * @param 			classname
	 */
	@Insert("INSERT INTO  businessclass "
			+ "(classname) VALUE ((#{map.classname}))")
	 int state(@Param("map")Map map);
	/**
	 * @Description:	创建商家
	 * @param p_user_id
	 * @param name
	 * @param address
	 * @param phone
	 * @param likenum
	 * @param collectnum
	 * @param businessclassid
	 * @return（展示方法参数和返回值）
	 */
	@Insert("INSERT INTO business "
			+ "(p_user_id,name,address,phone,like_num,collect_num,businessclass_id) "
			+ "VALUES ((#{map.puserid}),(#{map.name}),(#{map.address}),(#{map.phone}),(#{map.likenum}),(#{map.collectnum}),(#{map.businessclassid}))")
	int merchant(@Param("map")Map map);
}
