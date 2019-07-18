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
 * @ClassName	volunteer
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:10
 */
@Mapper
public interface PcVolunteerMapper {
	
	/**
	 * @Description:	获取志愿者相关信息
	 * @param 			part
	 * @return			返回一个封装的数据对象
	 */
	@Select("SELECT  v.title,v.content, "  
			+"DATE_FORMAT(v.start_time, '%Y-%m-%d') AS start_time, " 
			+"DATE_FORMAT(v.end_time, '%Y-%m-%d') AS end_time, " 
			+"v.status,v.post,v.address, "  
			+"v.phone,v.enlist,v.enrequire, "  
			+"DATE_FORMAT(v.specifictime, '%Y-%m-%d') AS specifictime " 
			+"FROM volunteer v")
	List<Map<String, Object>> volunteerpart();
	/**
	 * @Description:	根据志愿者id获取志愿者所有信息(详情页)
	 * @param 			elderlyid
	 * @return			返回一个封装数据对象
	 */
	@Select("SELECT  v.title,v.content, "  
			+"DATE_FORMAT(v.start_time, '%Y-%m-%d') AS start_time, "  
			+"DATE_FORMAT(v.end_time, '%Y-%m-%d') AS end_time, "  
			+"v.status,v.post,v.address AS volunteer_address, "  
			+"v.phone AS volunteer_phone,v.enlist,v.enrequire, "  
			+"DATE_FORMAT(v.specifictime, '%Y-%m-%d') AS specifictime, "  
			+"DATE_FORMAT(t.applicantdate, '%Y-%m-%d') AS applicantdate, "  
			+"t.name,t.idcard,t.home_address,t.phone AS volunteerapplicant_phone, "  
			+"i.address AS imagesource_address,i.width,i.height " 
			+"FROM volunteer v "  
			+"LEFT JOIN volunteerapplicant t "  
			+"ON v.volunteer = t.volunteer "  
			+"LEFT JOIN imagesource i "  
			+"ON v.volunteer = i.volunteer "  
			+"WHERE v.volunteer = (#{volunteerid})") 
	List<Map<String, Object>> volunteerall(@Param("volunteerid")int volunteerid);

	/**
	 * @Description: 根据志愿者id修改志愿者表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 */
	@Update("UPDATE volunteer  " 
			+"SET "  
			+"title = (CASE WHEN (#{map.title}) IS NULL THEN title ELSE (#{map.title}) END), " 
			+"content = (CASE WHEN (#{map.content}) IS NULL THEN content ELSE (#{map.content}) END), "  
			+"start_time = (CASE WHEN (#{map.starttime}) IS NULL THEN start_time ELSE (#{map.starttime}) END), "  
			+"end_time = (CASE WHEN (#{map.endtime}) IS NULL THEN end_time ELSE (#{map.endtime}) END), "  
			+"status = (CASE WHEN (#{map.status}) IS NULL THEN status ELSE (#{map.status}) END), "  
			+"post = (CASE WHEN (#{map.post}) IS NULL THEN post ELSE (#{map.post}) END), " 
			+"address = (CASE WHEN (#{map.address}) IS NULL THEN address ELSE (#{map.address}) END), " 
			+"phone = (CASE WHEN (#{map.phone}) IS NULL THEN phone ELSE (#{map.phone})END), " 
			+"enlist = (CASE WHEN (#{map.enlist}) IS NULL THEN enlist ELSE (#{map.enlist}) END), "  
			+"enrequire = (CASE WHEN (#{map.enrequire}) IS NULL THEN enrequire ELSE (#{map.enrequire}) END), "  
			+"specifictime = (CASE WHEN (#{map.specifictime}) IS NULL THEN specifictime ELSE (#{map.specifictime}) END) "  
			+"WHERE volunteer = (#{map.volunteer});")
	int volunteer(@Param("map")Map map);
	
	/**
	 * @Description:创建志愿者信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 */
	@Insert("INSERT volunteer "  
			+"(title,content,start_time,end_time,status, "  
			+"post,address,phone,enlist,enrequire,specifictime) "  
			+"VALUE " 
			+"((#{map.title}),(#{map.content}),(#{map.starttime}),(#{map.endtime}), "  
			+"(#{map.status}),(#{map.post}),(#{map.address}),(#{map.phone}),"
			+"(#{map.enlist}),(#{map.enrequire}),(#{map.specifictime}))")
	int ivolunteer(@Param("map")Map map);
	/**
	 * @Description:创建自愿者报名人信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 */
	@Insert("INSERT volunteerapplicant "  
			+"(volunteer,applicantdate,name,idcard,home_address,phone) "  
			+"VALUE "  
			+"((#{map.volunteer}),(#{map.applicantdate}),(#{map.name}),(#{map.idcard}),(#{map.home_address}),(#{map.phone}))")
	int ivolunteerapplicant(@Param("map")Map map);
	/**
	 * @Description:创建图片资源信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 */
	@Insert("INSERT imagesource " 
			+"(volunteer,address,width,height) " 
			+"VALUE " 
			+"((#{map.volunteer}),(#{map.address}),(#{map.width}),(#{map.height}))")
	int iimagesource(@Param("map")Map map);
	
	/**
	 * @Description: 根据自愿者报名人id修改自愿者报名人表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 */
	@Update("UPDATE volunteerapplicant "  
			+"SET  "  
			+"volunteer = (CASE WHEN (#{map.volunteer}) IS NULL THEN volunteer ELSE (#{map.volunteer}) END), "  
			+"applicantdate = (CASE WHEN (#{map.applicantdate}) IS NULL THEN applicantdate ELSE (#{map.applicantdate}) END), "  
			+"name = (CASE WHEN (#{map.name}) IS NULL THEN name ELSE (#{map.name}) END), "  
			+"idcard = (CASE WHEN (#{map.idcard}) IS NULL THEN idcard ELSE (#{map.idcard}) END), "  
			+"home_address = (CASE WHEN (#{map.homeaddress}) IS NULL THEN home_address ELSE (#{map.homeddress}) END), "  
			+"phone = (CASE WHEN (#{map.phone}) IS NULL THEN phone ELSE (#{map.phone}) END) "  
			+"WHERE volunteer = (#{map.volunteer})")
	int volunteerapplicant(@Param("map")Map map);
	/**
	 * @Description: 根据图片资源id修改图片资源表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 */
	@Update("UPDATE imagesource "  
			+"SET  "  
			+"volunteer = (CASE WHEN (#{map.ivolunteer}) IS NULL THEN volunteer ELSE (#{map.ivolunteer}) END), "  
			+"address = (CASE WHEN (#{map.address}) IS NULL THEN address ELSE (#{map.address}) END), "  
			+"width = (CASE WHEN (#{map.width}) IS NULL THEN width ELSE (#{map.width}) END), "  
			+"height = (CASE WHEN (#{map.height}) IS NULL THEN height ELSE (#{map.height}) END) " 
			+"WHERE volunteer = (#{map.volunteer})")
	int imagesource(@Param("map")Map map);
}
