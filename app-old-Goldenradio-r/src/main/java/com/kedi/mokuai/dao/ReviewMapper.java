package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:00
 */
@Mapper
public interface ReviewMapper {
	
	/**
	 * @Description: 获取实评所有信息
	 * @return		 返回一个封装数据对象review
	 */
	@Select("SELECT * FROM review")
	List<Map<String, Object>> review();
}
