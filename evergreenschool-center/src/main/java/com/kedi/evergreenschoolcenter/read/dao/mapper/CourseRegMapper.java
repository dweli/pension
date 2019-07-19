package com.kedi.evergreenschoolcenter.read.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:38
 */
@Mapper
public interface CourseRegMapper {
		
	/**
	 * @Description:  获取课程报名的所有数据
	 * @return		   返回一个封装数据对象coursereg
	 */
	@Select("SELECT course_reg_id,title,studyplace,"
			+ "DATE_FORMAT(begintime, '%Y-%m-%d') as begintime,"
			+ "DATE_FORMAT(endtime, '%Y-%m-%d') as endtime,"
			+ "note,url "
			+ "FROM course_reg")
	List<Map<String, Object>> coursereg();		

	
	
}
