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
public interface CourseRegMapper {
		
	//课程报名
	@Select("SELECT course_reg_id,title,studyplace,"
			+ "DATE_FORMAT(begintime, '%Y-%m-%d') as activetime,"
			+ "DATE_FORMAT(endtime, '%Y-%m-%d') as activetime,"
			+ "note,url "
			+ "FROM course_reg")
	List<Map<String, Object>> coursereg();		

	
	
}
