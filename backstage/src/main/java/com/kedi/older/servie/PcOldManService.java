package com.kedi.older.servie;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedi.older.mapper.PcOldManMapper;
/**
 * 
* @Description: 
* @author: dw 
* @date: 2019 2019年7月22日 下午1:23:56
 */
@Service
public class PcOldManService {
	
	@Autowired
	public PcOldManMapper mapper;
	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>oldpart() {
	    	return mapper.oldmanpart();
	    }	
	 /**
	  * @return	返回一个数据对象
	  */
	 public List<Map<String,Object>>oldall(int elderlyid) {
		 return mapper.oldmanall(elderlyid);
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
