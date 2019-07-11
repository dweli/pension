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
public interface HomenewsMapper {
		
	//获取国内新闻所有信息
	@Select("SELECT h.title,"
			+ "CONVERT (h.content  USING utf8) AS content,"
			+ "DATE_FORMAT(h.publishtime, '%Y-%m-%d') as publishtime,"
			+ "h.publishman,h.checker,h.`status`,"
			+ "s.* "
			+ "FROM homenews h "
			+ "LEFT JOIN homesource s "
			+ "ON h.homenews_id = s.homenews_id")
	List<Map<String, Object>> homenews();	
	
}