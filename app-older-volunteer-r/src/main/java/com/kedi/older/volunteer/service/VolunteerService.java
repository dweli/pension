package com.kedi.older.volunteer.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @Description:    志愿者service层
* @Author:         ytw
* @CreateDate:     2019/7/12 10:22
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface VolunteerService {
    /**
    * 方法实现说明  查询所有志愿者列表
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:22
    */
    List<Map<String,Object>> findList();

    /**
    * 方法实现说明 根据主键id查询志愿者详情
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:23
    */
    Map<String,Object> findDetail(@Param("id") Integer id );
}
