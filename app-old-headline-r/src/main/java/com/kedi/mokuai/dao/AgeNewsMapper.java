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
public interface AgeNewsMapper {
		
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
