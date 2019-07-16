package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:56
 */
@Mapper
public interface MusicMapper {
	
	
	/**
	 * @Description: 获取音乐所有信息
	 * @return       返回一个封装数据对象
	 */
	@Select("SELECT * FROM music")
	List<Map<String, Object>> music();
}
