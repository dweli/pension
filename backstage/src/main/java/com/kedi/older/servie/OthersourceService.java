package com.kedi.older.servie;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OthersourceService {
	public int insertOthersource(Map map);
	
	int updateOthersourceByNotNull(Map map);
	
	int deleteOthersource(int id);

}
