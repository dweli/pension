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
public interface OtherSourceMapper {
		
	@Select("SELECT o.other_source_id,o.title,"
			+ "CONVERT (`content`  USING utf8) AS content,"
			+ "o.url,o.phone "
			+ "FROM other_source  o")
	List<Map<String, Object>> othersource();		
	
	
}
