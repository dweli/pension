package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:20
 */
@Mapper
public interface ProvincialNewsMapper {
		
	/**
	 * @Description:	获取省内信息所有数据
	 * @return			返回一个封装的数据对象provincialnews
	 */
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
