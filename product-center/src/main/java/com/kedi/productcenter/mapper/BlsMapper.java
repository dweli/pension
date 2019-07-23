package com.kedi.productcenter.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
/**
* @Description:    mybatis mapper接口
* @Author:         ytw
* @CreateDate:     2019/7/22 15:53
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Mapper
public interface BlsMapper {
    /**
    * 方法实现说明  @select注解 查找所有商品
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/22 15:54
    */
    @Select("select opus.opus_id,opus.p_user_id,opus.name as opusname,status,price,opusource.address as imageaddress,user.name as username ,opus.pricenum,opus.collectionnum,opus.online_status as onlinestatus from \n" +
            "(opus left join user on opus.p_user_id=user.p_user_id)left join opusource on opus.opus_id=opusource.opus_id\n")
    List<Map<String,Object>> findList();

    /**
    * 方法实现说明  根据statusnum 查看商品列表
    * @author      ytw
    * @param         num
    * @return
    * @exception   
    * @date        2019/7/22 15:54
    */
    @Select("select opus.opus_id,opus.p_user_id,opus.name as opusname,status,price,opusource.address as imageaddress,user.name as username ,opus.pricenum,opus.collectionnum,opus.online_status as onlinestatus from \n" +
            "(opus left join user on opus.p_user_id=user.p_user_id)left join opusource on opus.opus_id=opusource.opus_id where opus.status=#{statusnum}")
    List<Map<String,Object>> findbyStatus(@Param("statusnum") Integer num);

    /**
    * 方法实现说明 根据商品id 查找商品详情
    * @author      ytw
    *@param      id
    * @return
    * @exception   
    * @date        2019/7/22 15:56
    */
    @Select("select opus.p_user_id as opus_p_user_id,opus.name as opusname ,status,price,weight,\n" +
            "uploadDate,uploadUser,saletime,opus.pricenum,opus.collectionnum,opus.online_status as onlinestatus,opusource.address as imageaddress from opus left join \n" +
            "opusource on opus.opus_id=opusource.opus_id  where opus.opus_id=#{id}")
    Map<String,Object> findDetail(@Param("id") Integer id);

    /**
    * 方法实现说明 根据用户id查找商品
    * @author      ytw
    *@param         userId
    * @return
    * @exception   
    * @date        2019/7/22 15:57
    */
    @Select("select * from user where user.p_user_id=#{userId}")
    Map<String,Object> findUserByUserId(@Param("userId") Integer userId);



}
