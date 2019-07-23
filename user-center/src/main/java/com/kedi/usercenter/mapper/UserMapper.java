package com.kedi.usercenter.mapper;


import com.kedi.usercenter.provider.UserProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.Map;

/**
* @Description:    usermapper
* @Author:         ytw
* @CreateDate:     2019/7/22 16:56
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Mapper
public interface UserMapper {
    /**
    * 方法实现说明  根据密码和电话找
    * @author      ytw
    *@param         mPassword,phone
    * @return
    * @exception   
    * @date        2019/7/22 16:47
    */
    @Select("select user.p_user_id from phone left join user_phone on user_phone.p_phone_id =phone.p_phone_id " +
            " left join user on  user_phone.p_user_id=user.p_user_id " +
            " where user.password=#{password} and phone.code=#{code};")
    Integer selectByNameAndPs(@Param("password") String mPassword,@Param("code") String phone);

    /**
    * 方法实现说明  根据身份证查询社区id
    * @author      ytw
    *@param         idcard
    * @return
    * @exception   
    * @date        2019/7/22 16:48
    */
    @Select("SELECT communityc.communityc_id from communityc left join village on communityc.communityc_id=village.communityc_id left join elderly on  " +
            "village.village_id =elderly.village_id   where elderly.idcard=${idcard} ")
    Map<String,Object> selectByIdcardfindName(@Param("idcard") String idcard);

    /**
    * 方法实现说明  更新用户信息
    * @author      ytw
    *@param         map
    * @return
    * @exception   
    * @date        2019/7/22 16:48
    */
    Integer updateUserInfo(Map map);

    /**
    * 方法实现说明  更新老人信息
    * @author      ytw
    *@param         map
    * @return
    * @exception   
    * @date        2019/7/22 16:48
    */
    Integer updateElderly(Map map);
    
    /**
    * 方法实现说明  更新
    * @author      ytw
    *@param         map
    * @return
    * @exception   
    * @date        2019/7/22 16:49
    */
    Integer updateCommunityc(Map map);

    /**
    * 方法实现说明  更新
    * @author      ytw
    *@param         newPassword,idcard
    * @return
    * @exception   
    * @date        2019/7/22 16:49
    */
    Integer updatePassword(@Param("newPassword") String newPassword,@Param("idcard") String idcard);

    /**
    * 方法实现说明
    * @author      ytw
    *@param         mPassword,phone
    * @return
    * @exception   
    * @date        2019/7/22 16:49
    */
    Integer updatePasswordByPhone(@Param("newPassword")String mPassword,@Param("phone") String phone);

    /**
    * 方法实现说明
    * @author      ytw
    *@param         map
    * @return      
    * @exception   
    * @date        2019/7/22 16:49
    */
    Integer insertUser(Map map);

    /**
    * 方法实现说明
    * @author      ytw
    *@param         map
    * @return      
    * @exception   
    * @date        2019/7/22 16:49
    */
    Integer insertPhone(Map map);

    /**
    * 方法实现说明
    * @author      ytw
    *@param         map
    * @return      
    * @exception   
    * @date        2019/7/22 16:49
    */
    Integer insertPhoneUser(Map map);

    /**
    * 方法实现说明   根据登录名找用户id
    * @author      ytw
    *@param         loginname
    * @return
    * @exception   
    * @date        2019/7/22 16:50
    */
    @Select("select user.p_user_id from user left join user_phone on user_phone.p_user_id=user.p_user_id left join " +
            "phone on phone.p_phone_id=user_phone.p_phone_id where user.loginname=${loginname};")
    Integer selectByloginname(@Param("loginname") String loginname);

    /**
    * 方法实现说明
    * @author      ytw
    *@param         phone
    * @return      
    * @exception   
    * @date        2019/7/22 16:50
    */
    @Select("select user.p_user_id from user left join user_phone on user_phone.p_user_id=user.p_user_id left join" +
            " phone on phone.p_phone_id=user_phone.p_phone_id where phone.code=${phone}")
    Integer selectByPhone(@Param("phone") String phone);

    /**
    * 方法实现说明  根据id 更新
    * @author      ytw
    *@param         map
    * @return
    * @exception   
    * @date        2019/7/22 16:50
    */
    @UpdateProvider(type=UserProvider.class,method = "updateUser")
    Integer updateById(Map map );

}
