package com.kedi.older.opus.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @Description:    老人商品service层
* @Author:         ytw
* @CreateDate:     2019/7/12 9:58
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface OpusService {
    /**
    * 方法实现说明 查询所有商品
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:59
    */
    List<Map<String,Object>> findList();

    /**
    * 方法实现说明  根据状态 num=1 已上传  num=2 成交作品 num=3 已购买作品   查询商品列表
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:59
    */
    List<Map<String,Object>> findbyStatus(@Param("statusnum") Integer num );

    /**
    * 方法实现说明 根据id查询商品详情
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:00
    */
    Map<String,Object> findDetail(@Param("id") Integer id );

    /**
    * 方法实现说明    上传作品根据表单提交信息插入数据库
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:04
    */
    Integer createOpus(Map map);

}
