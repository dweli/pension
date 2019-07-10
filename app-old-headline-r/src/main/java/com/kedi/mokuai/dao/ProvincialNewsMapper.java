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
public interface ProvincialNewsMapper {
		
	@Select("SELECT p.title, "  
			+"CONVERT (p.content  USING utf8) AS content, "  
			+"DATE_FORMAT(p.publishtime, '%Y-%m-%d') as publishtime, "  
			+"p.publishman,p.checker,p.`status`, "  
			+"s.* "  
			+"FROM provincialnews p "  
			+"LEFT JOIN provsource s "  
			+"ON p.provincial_id = s.provincial_id")
	List<Map<String, Object>> provincialnews();		
		
}
