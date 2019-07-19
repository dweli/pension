package com.kedi.evergreenschoolcenter.read.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 		陈辽逊
 * @date: 			2019/7/13 10:29
 */
@Mapper
public interface OnlineClassMapper {
	
	/**
	 * @Description: 获取在线课堂的所有状态
	 * @return		 返回一个封装数据对象online
	 */
	@Select("SELECT calss FROM  onlineclass")
	List<Map<String, Object>> calss();		
	
	/**
	 * @Description: 根据类型获取在线课堂所有数据
	 * @return		  返回一个封装数据对象online
	 */
	@Select("SELECT c.p_user_id,c.title,c.content,"
			+ "c.imageaddress,c.praisenum,c.collectnum,"
			+ "CONVERT (c.calss  USING utf8) as calss,"
			+ "DATE_FORMAT(c.pulishtime, '%Y-%m-%d') as pulishtime,"
			+ "s.*"
			+ "FROM onlineclass c "
			+ "LEFT JOIN onlinesource s "
			+ "on c.id = s.id "
			+ "WHERE calss = (#{cal})")
	List<Map<String, Object>> online(@Param("cal") int cal);	
	
}
