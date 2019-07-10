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
public interface CommunitysalonMapper {
		
	//社区沙龙
	@Select("SELECT c.communitysalon_id,c.sponsor,"
			+ "DATE_FORMAT(c.activetime, '%Y-%m-%d') as activetime,"
			+ "c.introduction,c.title,c.activeplace,c.limitnum,"
			+ "s.* "
			+ "FROM communitysalon c "
			+ "LEFT JOIN communitesource s "
			+ "on c.communitysalon_id = s.communitysalon_id")
	List<Map<String, Object>> communitysalon();		
	
}
