package com.older.welfare.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
/**
* @Description:    民政福利 servi层
* @Author:         ytw
* @CreateDate:     2019/7/12 10:25
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface WelfareService {
    /**
    * 方法实现说明  民政福利 所有列表查询
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:25
    */
    List<Map<String, Object>> selectAll();

    /**
    * 方法实现说明  民政福利详情查询
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:25
    */
    Map<String, Object> selectAllByWelfareId(@Param("id") Integer id );
}
