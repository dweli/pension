package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * @Author 		陈辽逊
 * @Time 		2019年7月13日 10:35
 */
@Mapper
public interface OldhealthMapper {

	/*@Select("SELECT * FROM `bed_oldlife` order by oldlife_id")
    List<Map<String, Object>> findByName();	
	
	@Select("SELECT * FROM `bed_oldlife` where price>(#{minprice}) and price<(#{maxprice})")
	List<Map<String, Object>> oldprice(@Param("minprice")int minprice,@Param("maxprice")int maxprice);
	*/
	

	@Select("SELECT e.elderly_health_id,e.p_user_id,e.lable,f.foodclass, "
			+ "DATE_FORMAT(e.effectivetime, '%Y-%m-%d') as effectivetime,"
			+ "DATE_FORMAT(e.expiry, '%Y-%m-%d') as expiry,"
			+ "h.*,i.*,f.food_id,f.name,f.price,CONVERT (f.introduce USING utf8) AS introduce "
			+ "FROM elderly_health e "
			+ "LEFT JOIN health_food h "
			+ "ON e.elderly_health_id=h.elderly_health_id "
			+ "LEFT JOIN food f "
			+ "ON h.food_id=f.food_id "
			+ "LEFT JOIN food_image i "
			+ "ON f.food_id=i.food_id "
			+ "WHERE p_user_id=(#{olduserid})")
	List<Map<String, Object>> olduserid(@Param("olduserid")int olduserid);
}
