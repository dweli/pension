package com.kedi.healthcenter.write.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:32
 */
@Mapper
public interface OtherSourceMapper {
		

	@Select("SELECT * FROM other_source")
	List<Map<String, Object>> findBedList();		
	
	
	
}
