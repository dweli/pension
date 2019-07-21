package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:17
 */
@Mapper
public interface HeadlineMapper {
		
	
	/**
	 * 	@Description:	获取国内新闻所有信息
	 * @return			返回一个封装的数据对象homenews
	 */
	@Select("SELECT h.title,"
			+ "CONVERT (h.content  USING utf8) AS content,"
			+ "DATE_FORMAT(h.publishtime, '%Y-%m-%d') as publishtime,"
			+ "h.publishman,h.checker,h.`status`,"
			+ "h.cover_image,"
			+ "s.* "
			+ "FROM homenews h "
			+ "LEFT JOIN homesource s "
			+ "ON h.homenews_id = s.homenews_id")
	List<Map<String, Object>> homenews();	
	
	/**
	 * @Description:	获取国际新闻信息所有数据
	 * @return			返回一个封装的数据对象internationalnews
	 */
	@Select("SELECT i.title, " 
			+"CONVERT (i.content  USING utf8) AS content,\r\n "
			+"DATE_FORMAT(i.publishtime, '%Y-%m-%d') as publishtime,\r\n "
			+"i.publishman,i.checker,i.`status`,i.cover_image,\r\n "
			+"s.* "
			+"FROM internationalnews i\r\n "
			+"LEFT JOIN intersource s\r\n " 
			+"ON i.internews_id = s.internews_id")
	List<Map<String, Object>> internationalnews();	
	
	/**
	 * @Description:	获取省内信息所有数据
	 * @return			返回一个封装的数据对象provincialnews
	 */
	@Select("SELECT p.title, "  
			+"CONVERT (p.content  USING utf8) AS content, "  
			+"DATE_FORMAT(p.publishtime, '%Y-%m-%d') as publishtime, "  
			+"p.publishman,p.cover_image,p.checker,p.`status`, "  
			+"s.* "  
			+"FROM provincialnews p "  
			+"LEFT JOIN provsource s "  
			+"ON p.provincial_id = s.provincial_id")
	List<Map<String, Object>> provincialnews();		
	/**
	 * @Description:	获取老年新闻信息所有数据
	 * @return			返回一个封装的数据对象agenews
	 */
	@Select("SELECT a.title, "   
			+"CONVERT (a.content  USING utf8) AS content, "   
			+"DATE_FORMAT(a.publishtime, '%Y-%m-%d') as publishtime, "   
			+"a.publishman,a.checker,a.cover_image,a.`status`, "   
			+"s.* "   
			+"FROM age_news a "   
			+"LEFT JOIN agenews_source s "   
			+"ON a.agenews_id = s.agenews_id")
	List<Map<String, Object>> agenews();
	
	/**
	 * 	@Description:	获取国内新闻信息根据id
	 * @return			返回一个封装的数据对象homenews
	 */
	@Select("SELECT h.title,"
			+ "CONVERT (h.content  USING utf8) AS content,"
			+ "DATE_FORMAT(h.publishtime, '%Y-%m-%d') as publishtime,"
			+ "h.publishman,h.checker,h.`status`,"
			+ "h.cover_image,"
			+ "s.* "
			+ "FROM homenews h "
			+ "LEFT JOIN homesource s "
			+ "ON h.homenews_id = s.homenews_id WHERE h.`homenews_id` = #{id}")
	Map<String, Object> homenewsDetailByid(@Param("id") int id);
	
	/**
	 * @Description:	获取国际新闻信息所有数据
	 * @return			返回一个封装的数据对象internationalnews
	 */
	@Select("SELECT i.title, " 
			+"CONVERT (i.content  USING utf8) AS content,\r\n "
			+"DATE_FORMAT(i.publishtime, '%Y-%m-%d') as publishtime,\r\n "
			+"i.publishman,i.checker,i.`status`,i.cover_image,\r\n "
			+"s.* "
			+"FROM internationalnews i\r\n "
			+"LEFT JOIN intersource s\r\n " 
			+"ON i.internews_id = s.internews_id WHERE i.`internews_id` = #{id}" )
	Map<String, Object> internationalnewsDetailByid(@Param("id") int id);
	
	/**
	 * @Description:	获取省内信息数据根据id
	 * @return			返回一个封装的数据对象provincialnews
	 */
	@Select("SELECT p.title, "  
			+"CONVERT (p.content  USING utf8) AS content, "  
			+"DATE_FORMAT(p.publishtime, '%Y-%m-%d') as publishtime, "  
			+"p.publishman,p.cover_image,p.checker,p.`status`, "  
			+"s.* "  
			+"FROM provincialnews p "  
			+"LEFT JOIN provsource s "  
			+"ON p.provincial_id = s.provincial_id WHERE p.`provincial_id` = #{id}")
	Map<String, Object> provincialnewsDetailByid(@Param("id") int id);
	
	@Select("SELECT a.title, "   
			+"CONVERT (a.content  USING utf8) AS content, "   
			+"DATE_FORMAT(a.publishtime, '%Y-%m-%d') as publishtime, "   
			+"a.publishman,a.checker,a.cover_image,a.`status`, "   
			+"s.* "   
			+"FROM age_news a "   
			+"LEFT JOIN agenews_source s "   
			+"ON a.agenews_id = s.agenews_id WHERE a.`agenews_id` = #{id}")
	Map<String, Object> agenewsDetailByid(@Param("id") int id);
}
