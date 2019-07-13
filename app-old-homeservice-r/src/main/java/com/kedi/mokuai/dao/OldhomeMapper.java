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
public interface OldhomeMapper {
	
	@Select("SELECT b.*,c.commodity_id,c.commodityclass_id,c.`name`,"
			+ "DATE_FORMAT(c.uploadtime, '%Y-%m-%d') as uploadtime,c.price,c.minprice,c.maxprice,c.`status`,"
			+ "DATE_FORMAT(c.sailtime, '%Y-%m-%d') as sailtime,c.describle from business b "
			+ "LEFT JOIN commodity c "
			+ "ON b.business_id=c.business_id")
	List<Map<String, Object>> commodity();
	
	/*@Select("SELECT * from business WHERE business_id = (#{buserid})")
	List<Map<String, Object>> business(@Param("buserid")int buserid);
	
	@Select("SELECT commodity_id,commodityclass_id,`name`,"
			+ "DATE_FORMAT(uploadtime, '%Y-%m-%d') as uploadtime,"
			+ "price,minprice,maxprice,`status`,"
			+ "DATE_FORMAT(sailtime, '%Y-%m-%d') as sailtime,"
			+ "describle FROM commodity WHERE business_id = (#{buserid})")
	List<Map<String, Object>> commodity(@Param("buserid")int buserid);*/
}
