package com.kedi.older.servie;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kedi.older.mapper.PcVolunteerMapper;

/**
 * 
 *
 * @ClassName	PcVolunteerService
 * @author: 	陈辽逊
 * @date: 		2019/7/17 11:32
 */
@Service
public class PcVolunteerService {
	
	@Autowired
	public PcVolunteerMapper mapper;
	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>volunteerpart() {
	    	return mapper.volunteerpart();
	    }	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>volunteerall(int volunteerid) {
		 return mapper.volunteerall(volunteerid);
	 }	
	 /**
	  * @return	返回一个数据对象
	  */
	 public int volunteer(Map map) {
		 
		 return mapper.volunteer(map);
	 }	   	 
	 /**
	  * @return	返回一个数据对象
	  */
	 public int ivolunteer(Map map) {
		 
		 return mapper.ivolunteer(map);
	 }	   	 
	 /**
	  * @Description: 修改志愿者报名人和图片资源信息
	  * @return		   返回一个数据对象
	  */
	 @Transactional(rollbackFor=Exception.class)
	 public boolean volunteerpictures(Map map) {
		 int a = mapper.imagesource(map);
		 int b = mapper.volunteerapplicant(map);		 
		 if (a==1&&b==1) {
			return true;
		}else {
			return false;
		}
	 }	   	 
	 /**
	  * @Description: 创建志愿者报名人和图片资源信息
	  * @return		   返回一个数据对象
	  */
	 @Transactional(rollbackFor=Exception.class)
	 public boolean ivolunteerpictures(Map map) {
		 int a = mapper.iimagesource(map);
		 int b = mapper.ivolunteerapplicant(map);		 
		 if (a==1&&b==1) {
			 return true;
		 }else {
			 return false;
		 }
	 }	   	 
}
