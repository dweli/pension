package com.kedi.older.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 
 *
 * @ClassName	PcOldLifeMapper
 * @author: 	陈辽逊
 * @date: 		2019/7/17 15:47
 */
@Mapper
public interface PcHuiLaoactiveMapper {
 
	/**
	 * @Description:	根据慧老封面图片获取慧老活动列表 1代表封面图片
	 * @return			返回一个封装的数据对象huilaoactivepart
	 */
	@Select("SELECT b.activetheme, " 
			+"DATE_FORMAT(b.activetime, '%Y-%m-%d') as activetime, "  
			+"i.address,i.width,i.height "  
			+"FROM huilaoactive b "  
			+"LEFT JOIN huilaoimage i "  
			+"ON b.active_id = i.active_id "  
			+"WHERE iscover = 1")
	List<Map<String, Object>> huilaoactivepart();
	/**
	 * @Description:	根据慧老活动id和活动图片获取慧老活动详细信息 2代表活动图片
	 * @param 			activeid
	 * @return			返回一个封装的数据对象oldall
	 */
	@Select("SELECT h.title,h.content, "  
			+"DATE_FORMAT(h.activetime, '%Y-%m-%d') as activetime, "  
			+"h.eventslogans,h.phone,h.contacts,h.email, "  
			+"i.address,i.width,i.height " 
			+"FROM huilaoactive h "  
			+"LEFT JOIN huilaoimage i "  
			+"ON h.active_id = i.active_id "  
			+"WHERE h.active_id = (#{activeid}) AND iscover = 2")
	List<Map<String, Object>> huilaoactiveall(@Param("activeid")int activeid);


	/**
	 * @Description:	创建慧老活动信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Insert("INSERT huilaoactive "  
			+"(title,content,activetheme,activetime,eventslogans,phone,contacts,email) "  
			+"VALUE "  
			+"((#{map.title}),(#{map.content}),(#{map.activetheme}),(#{map.activetime}),(#{map.eventslogans}), "  
			+"(#{map.phone}),(#{map.contacts}),(#{map.email})) " ) 
	int ihuilaoactive(@Param("map")Map map);
	/**
	 * @Description:	创建惠老活动图片资源信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Insert("INSERT huilaoimage "  
			+"(active_id,address,width,height,iscover) "  
			+"VALUE "  
			+"((#{map.activeid}),(#{map.address}),(#{map.width}),(#{map.height}),(#{map.iscover}))")
	int ihuilaoimage(@Param("map")Map map);
	/**
	 * @Description:	根据慧老id修改床惠老活动图片资源信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Update("UPDATE huilaoimage "  
			+"SET  "  
			+"active_id = (CASE WHEN (#{map.activeid}) IS NULL THEN active_id ELSE (#{map.activeid}) END), "  
			+"address =  (CASE WHEN (#{map.address}) IS NULL THEN address ELSE (#{map.address}) END), " 
			+"width = (CASE WHEN (#{map.width}) IS NULL THEN width ELSE (#{map.width}) END), "  
			+"height = (CASE WHEN (#{map.height}) IS NULL THEN height ELSE (#{map.height}) END), "  
			+"iscover = (CASE WHEN (#{map.iscover}) IS NULL THEN iscover ELSE (#{map.iscover}) END) "  
			+"WHERE active_id = (#{map.activeid})")
	int huilaoimage(@Param("map")Map map);
	/**
	 * @Description:	根据慧老id修改慧老活动信息
	 * @param 			map
	 * @return			返回一个封装的数据对象map
	 */
	@Update("UPDATE huilaoactive "  
			+"SET  "  
			+"title = (CASE WHEN (#{map.title}) IS NULL THEN title ELSE (#{map.title}) END), "  
			+"content =  (CASE WHEN (#{map.content}) IS NULL THEN content ELSE (#{map.content}) END), "  
			+"activetheme = (CASE WHEN (#{map.activetheme}) IS NULL THEN activetheme ELSE (#{map.activetheme}) END), "  
			+"activetime = (CASE WHEN (#{map.activetime}) IS NULL THEN activetime ELSE (#{map.activetime}) END), " 
			+"eventslogans = (CASE WHEN (#{map.eventslogans}) IS NULL THEN eventslogans ELSE (#{map.eventslogans}) END), "  
			+"phone = (CASE WHEN (#{map.phone}) IS NULL THEN phone ELSE (#{map.phone}) END), "  
			+"contacts = (CASE WHEN (#{map.contacts}) IS NULL THEN contacts ELSE (#{map.contacts}) END), "  
			+"email = (CASE WHEN (#{map.email}) IS NULL THEN email ELSE (#{map.email}) END) "  
			+"WHERE active_id = (#{map.activeid})")
	int huilaoactive(@Param("map")Map map);
}
