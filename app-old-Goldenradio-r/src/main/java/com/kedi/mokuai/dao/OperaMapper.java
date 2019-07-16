package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:59
 */
@Mapper
public interface OperaMapper {
	
	/**
	 * @Description: 获取戏曲所有信息
	 * @return		 返回一个数据对象opera
	 */
	@Select("SELECT * FROM opera")
	List<Map<String, Object>> opera();
}
