package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:19
 */
@Mapper
public interface InternationalnewsMapper {
	
	/**
	 * @Description:	获取国际新闻信息所有数据
	 * @return			返回一个封装的数据对象internationalnews
	 */
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
