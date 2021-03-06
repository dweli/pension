package com.kedi.healthcenter.read.dao.mapper;

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
public interface OldlifeMapper {
		

	@Select("SELECT bed_id,oldlife_id,bedNumsber,price,minPrice,maxPrice, "
			+ "`status`,p_user_id,`name`,address,phone,"
			+ "CONVERT (`Introduction`  USING utf8) AS Introduction,"
			+ "praise_points,collection_num,url "
			+ "FROM `bed_oldlife` "
			+ "order by oldlife_id")
	List<Map<String, Object>> findBedList();		
	
	/**
	 * @Description:	根据最低价格和最高价格的获取区间信息所有数据
	 * @param 			minprice
	 * @param 			maxprice
	 * @return			根据minprice和maxprice返回一个数据对象
	 */
	@Select("SELECT bed_id,oldlife_id,bedNumsber,price,minPrice,maxPrice,"
			+ "`status`,p_user_id,`name`,address,phone,"
			+ "CONVERT (`Introduction`  USING utf8) AS Introduction,"
			+ "praise_points,collection_num,url "
			+ "FROM `bed_oldlife` "
			+ "where price>(#{minprice}) and price<(#{maxprice})")
	List<Map<String, Object>> oldprice(@Param("minprice")int minprice,@Param("maxprice")int maxprice);
	
	
	
}
