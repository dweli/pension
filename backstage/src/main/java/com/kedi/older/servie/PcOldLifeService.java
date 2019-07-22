package com.kedi.older.servie;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kedi.older.mapper.PcOldLifeMapper;


/**
 * 
 *
 * @ClassName	PcOldLifeService
 * @author: 	陈辽逊
 * @date: 		2019/7/17 11:32
 */
@Service
public class PcOldLifeService {
	
	@Autowired
	public PcOldLifeMapper mapper;
	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>oldlifepart() {
	    	return mapper.oldlifepart();
	    }	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>oldlifeall(int oldlifeid) {
		 return mapper.oldlifeall(oldlifeid);
	 }	   	 
	 /**
	  * @Description: 修改相关床位养老院的信息
	  * @return		   返回一个数据对象
	  */
	 @Transactional(rollbackFor=Exception.class)
	 public boolean bedoldlife(Map map) {
		 int a = mapper.oldlife(map);
		 int b = mapper.bed(map);		 
		 if (a==1&&b==1) {
			return true;
		}else {
			return false;
		}
	 }	   	 
	 /**
	  * @Description: 创建相关床位养老院的信息
	  * @return		   返回一个数据对象
	  */
	 @Transactional(rollbackFor=Exception.class)
	 public boolean ibedoldlife(Map map) {
		 int a = mapper.ioldlife(map);
		 int b = mapper.ibed(map);		 
		 if (a==1&&b==1) {
			 return true;
		 }else {
			 return false;
		 }
	 }	   	 
}
