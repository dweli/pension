package com.kedi.productcenter.service;



import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;


/**
* @Description:    比南山商品服务
* @Author:         ytw
* @CreateDate:     2019/7/11 10:38
* @UpdateRemark:   修改内容
* @Version:        1.0
*/


public interface BlsProductService {
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
     *             @param  num
     * @return
     * @exception
     * @date        2019/7/12 9:59
     */
    List<Map<String,Object>> findbyStatus(@Param("statusnum") Integer num );

    /**
     * 方法实现说明 根据id查询商品详情
     * @author      ytw
     *@param      id
     * @return
     * @exception
     * @date        2019/7/12 10:00
     */
    Map<String,Object> findDetail(@Param("id") Integer id );


}
