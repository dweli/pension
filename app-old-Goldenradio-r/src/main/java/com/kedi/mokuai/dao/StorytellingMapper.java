package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
/**
 * 
 * @ClassName UserMapper
 * @Author 陈辽逊
 * @Time 2019年7月3日 上午11:12:43
 */
@Mapper
public interface StorytellingMapper {
	
	//获取评书所有数据
	@Select("SELECT * FROM storytelling")
	List<Map<String, Object>> storytelling();
}
