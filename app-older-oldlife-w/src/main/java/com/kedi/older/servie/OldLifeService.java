package com.kedi.older.servie;

import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;


public interface OldLifeService {
    List<Map<String,Object>> findByName();
    int updatePraise(@Param("id") Integer id);
    int updateCollection(@Param("id") Integer id);
}
