package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:40
 */
@Mapper
public interface CommunitysalonMapper {
		
	/**
	 * @Description:	获取	社区沙龙数据表的所有数据
	 * @return			返回一个封装数据对象communitysalon
	 */
		@Select("SELECT c.communitysalon_id,c.sponsor,"
				+ "DATE_FORMAT(c.activetime, '%Y-%m-%d') as activetime,"
				+ "c.introduction,c.title,c.activeplace,c.limitnum,"
				+ "s.* "
				+ "FROM communitysalon c "
				+ "LEFT JOIN communitesource s "
				+ "on c.communitysalon_id = s.communitysalon_id")
	List<Map<String, Object>> communitysalon();		
	
}
