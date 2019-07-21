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
public interface GoldenRadioMapper {
	
	/**
	 * @Description: 获取评书所有数据信息
	 * @return		 返回一个封装数据对象storytelling
	 */
	
	@Select("SELECT * FROM storytelling")
	List<Map<String, Object>> storytelling();
	
	/**
	 * @Description: 获取戏曲所有信息
	 * @return		 返回一个数据对象opera
	 */
	@Select("SELECT * FROM opera")
	List<Map<String, Object>> opera();
	
	/**
	 * @Description: 获取音乐所有信息
	 * @return       返回一个封装数据对象
	 */
	@Select("SELECT * FROM music")
	List<Map<String, Object>> music();
	
	/**
	 * @Description: 获取实评所有信息
	 * @return		 返回一个封装数据对象review
	 */
	@Select("SELECT * FROM review")
	List<Map<String, Object>> review();
}
