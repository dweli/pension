package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @ClassName	OldhomeMapper
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:10
 */
@Mapper
public interface OldhomeMapper {
	
	/**
	 * @Description:	获取家政服务信息表的所有数据
	 * @return			返回一个封装的数据对象commodity
	 */
	@Select("SELECT b.*,c.commodity_id,c.commodityclass_id,c.`name`,"
			+ "DATE_FORMAT(c.uploadtime, '%Y-%m-%d') as uploadtime,c.price,c.minprice,c.maxprice,c.`status`,"
			+ "DATE_FORMAT(c.sailtime, '%Y-%m-%d') as sailtime,c.describle from business b "
			+ "LEFT JOIN commodity c "
			+ "ON b.business_id=c.business_id")
	List<Map<String, Object>> commodity();
}
