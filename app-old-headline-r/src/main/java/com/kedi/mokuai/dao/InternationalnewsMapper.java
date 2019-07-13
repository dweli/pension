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
public interface InternationalnewsMapper {
	
	//获取国际新闻所有信息
	@Select("SELECT i.title, " 
			+"CONVERT (i.content  USING utf8) AS content,\r\n "
			+"DATE_FORMAT(i.publishtime, '%Y-%m-%d') as publishtime,\r\n "
			+"i.publishman,i.checker,i.`status`,\r\n "
			+"s.* "
			+"FROM internationalnews i\r\n "
			+"LEFT JOIN intersource s\r\n " 
			+"ON i.internews_id = s.internews_id")
	List<Map<String, Object>> internationalnews();		

}
