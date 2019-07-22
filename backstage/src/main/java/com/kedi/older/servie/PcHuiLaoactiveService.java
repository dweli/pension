package com.kedi.older.servie;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kedi.older.mapper.PcHuiLaoactiveMapper;



/**
 * 
 *
 * @ClassName	PcHuiLaoactiveService
 * @author: 	陈辽逊
 * @date: 		2019/7/17 11:32
 */
@Service
public class PcHuiLaoactiveService {
	
	@Autowired
	public PcHuiLaoactiveMapper mapper;
	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>huilaoactivepart() {
	    	return mapper.huilaoactivepart();
	    }	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>huilaoactiveall(int activeid) {
		 return mapper.huilaoactiveall(activeid);
	 }	   	 
	 /**
	  * @Description: 修改相关慧老活动对应的慧老图片资源信息
	  * @return		   返回一个数据对象
	  */
	 @Transactional
	 public boolean huilaoactive(Map map) {
		 int a = mapper.huilaoactive(map);
		 int b = mapper.huilaoimage(map);		 
		 if (a==1&&b==1) {
			return true;
		}else {
			return false;
		}
	 }	   	 
	 /**
	  * @Description: 创建相关慧老活动对应的慧老图片资源信息
	  * @return		   返回一个数据对象
	  */
	 @Transactional
	 public boolean ihuilaoactive(Map map) {
		 int a = mapper.ihuilaoactive(map);
		 int b = mapper.ihuilaoimage(map);		 
		 if (a==1&&b==1) {
			 return true;
		 }else {
			 return false;
		 }
	 }	   	 
}
