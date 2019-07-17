package com.kedi.older.servie;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.older.mapper.OldManMapper;

@Service
public class OldManService {
	
	@Autowired
	public OldManMapper mapper;
	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>oldpart() {
	    	return mapper.oldpart();
	    }	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>oldall(int elderlyid) {
		 return mapper.oldall(elderlyid);
	 }	
	 /**
	  * @return	返回一个数据对象
	  */
	 public int elderly(Map map) {
		 
		 return mapper.elderly(map);
	 }	   	 
	 /**
	  * @return	返回一个数据对象
	  */
	 public int ielderly(Map map) {
		 
		 return mapper.ielderly(map);
	 }	   	 
}
