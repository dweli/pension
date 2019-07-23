package com.kedi.usercenter.service;




import java.util.Map;

/**
* @Description:    用户登录service层
* @Author:         ytw
* @CreateDate:     2019/7/22 16:53
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface LoginService {


    /**
    * 方法实现说明  用户登录
    * @author      ytw
    *@param         idcard
    * @return
    * @exception   
    * @date        2019/7/16 15:18
    */

    Map<String,Object> selectByIdcardfindName(String idcard);

    
    /**
    * 方法实现说明  根据密码和电话 查找是否有这个用户
    * @author      ytw
    *@param         mPassword,phone
    * @return
    * @exception   
    * @date        2019/7/22 14:40
    */
    Integer selectByNameAndPs(String mPassword,String phone);

    /**
    * 方法实现说明
    * @author      ytw
    *@param         phone
    * @return
    * @exception   
    * @date        2019/7/22 14:41
    */
     Integer selectByPhoneAndcode(String phone);
}
