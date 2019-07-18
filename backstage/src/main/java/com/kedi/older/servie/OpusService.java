package com.kedi.older.servie;

import java.util.Map;

public interface OpusService {
    
    int insertOpus(Map map);
	
	int updateOpusByNotNull(Map map);
	
	int deleteOpus(int id);
}
