package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @version:		1.0
 * @Description: 	获取
 * @author:			陈辽逊
 * @date: 			2019-7-8 10.39
 */
@Mapper
public interface OnlineClassMapper {
	
	//在线课堂
	@Select("SELECT c.p_user_id,c.title,c.content,"
			+ "c.imageaddress,c.praisenum,c.collectnum,"
			+ "CONVERT (c.calss  USING utf8) as calss,"
			+ "DATE_FORMAT(c.pulishtime, '%Y-%m-%d') as pulishtime,"
			+ "s.*"
			+ "FROM onlineclass c "
			+ "LEFT JOIN onlinesource s "
			+ "on c.id = s.id")
	List<Map<String, Object>> online();		
	
	
	
}
