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
public interface OperaMapper {
	
	//获取戏曲所有信息
	@Select("SELECT * FROM opera")
	List<Map<String, Object>> opera();
}