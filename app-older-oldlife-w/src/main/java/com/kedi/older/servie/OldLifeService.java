package com.kedi.older.servie;

import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

/**
* @Description:    点赞和收藏+1servcie层
* @Author:         ytw
* @CreateDate:     2019/7/12 9:50
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface OldLifeService {
    List<Map<String,Object>> findByName();
    int updatePraise(@Param("id") Integer id);
    int updateCollection(@Param("id") Integer id);
}
