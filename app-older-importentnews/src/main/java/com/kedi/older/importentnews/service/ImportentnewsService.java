package com.kedi.older.importentnews.service;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @Description:    重要消息service层
* @Author:         ytw
* @CreateDate:     2019/7/12 13:39
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface ImportentnewsService {

    /**
    * 方法实现说明
    * @author      获取所有重要消息
    *@param
    * @return
    * @exception
    * @date        2019/7/12 13:39
    */
    List<Map<String,Object>> findList();

    /**
    * 方法实现说明
    * @author      根据id获取
    *@param
    * @return
    * @exception
    * @date        2019/7/12 13:39
    */
    List<Map<String, Object>> findOne(@Param("id") Integer id );
}
