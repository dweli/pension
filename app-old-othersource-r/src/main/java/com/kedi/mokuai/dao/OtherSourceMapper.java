package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:38
 */
@Mapper
public interface OtherSourceMapper {
		
	/**
	 * @Description:	获取肿瘤基因的信息所有数据
	 * @return			返回一个封装数据对象othersource
	 */
	@Select("SELECT o.other_source_id,o.title,"
			+ "CONVERT (`content`  USING utf8) AS content,"
			+ "o.url,o.phone "
			+ "FROM other_source  o")
	List<Map<String, Object>> othersource();		
			
}
