package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @version:		1.0
 * @Description: 	获取
 * @author:			陈辽逊
 * @date: 			2019-7-8 10.39
 */
@Mapper
public interface OldlifeMapper {
		
	@Select("SELECT bed_id,oldlife_id,bedNumsber,price,minPrice,maxPrice,"
			+ "`status`,p_user_id,`name`,address,phone,"
			+ "CONVERT (`Introduction`  USING utf8) AS Introduction,"
			+ "praise_points,collection_num,url"
			+ "FROM `bed_oldlife` "
			+ "order by oldlife_id")
	List<Map<String, Object>> findByName();		
	
	@Select("SELECT bed_id,oldlife_id,bedNumsber,price,minPrice,maxPrice,"
			+ "`status`,p_user_id,`name`,address,phone,"
			+ "CONVERT (`Introduction`  USING utf8) AS Introduction,"
			+ "praise_points,collection_num,url "
			+ "FROM `bed_oldlife` "
			+ "where price>(#{minprice}) and price<(#{maxprice})")
	List<Map<String, Object>> oldprice(@Param("minprice")int minprice,@Param("maxprice")int maxprice);
	
	
	
}
