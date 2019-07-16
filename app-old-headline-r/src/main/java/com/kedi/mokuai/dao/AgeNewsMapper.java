package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:17
 */
@Mapper
public interface AgeNewsMapper {
		
	/**
	 * @Description:	获取老年新闻信息所有数据
	 * @return			返回一个封装的数据对象agenews
	 */
	@Select("SELECT a.title, "   
			+"CONVERT (a.content  USING utf8) AS content, "   
			+"DATE_FORMAT(a.publishtime, '%Y-%m-%d') as publishtime, "   
			+"a.publishman,a.checker,a.`status`, "   
			+"s.* "   
			+"FROM age_news a "   
			+"LEFT JOIN agenews_source s "   
			+"ON a.agenews_id = s.agenews_id")
	List<Map<String, Object>> agenews();		
}
