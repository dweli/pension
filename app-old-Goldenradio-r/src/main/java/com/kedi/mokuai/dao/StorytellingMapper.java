package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:01
 */
@Mapper
public interface StorytellingMapper {
	
	/**
	 * @Description: 获取评书所有数据信息
	 * @return		 返回一个封装数据对象storytelling
	 */
	
	@Select("SELECT * FROM storytelling")
	List<Map<String, Object>> storytelling();
}
