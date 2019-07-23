package com.kedi.usercenter.service;

import java.util.Map;

/**
* @Description:    用户注册
* @Author:         ytw
* @CreateDate:     2019/7/22 14:47
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface UserRegisterService {
    /**
    * 方法实现说明  用户校验
    * @author      ytw
    *@param         loginname,code
    * @return      
    * @exception   
    * @date        2019/7/22 14:47
    */
    Boolean checkUser(String loginname, String code);

    /**
    * 方法实现说明   插入用户信息
    * @author      ytw
    *@param         map
    * @return
    * @exception   
    * @date        2019/7/22 14:48
    */
    Integer insertUser(Map map);
    
    /**
    * 方法实现说明  插入电话
    * @author      ytw
    *@param         map
    * @return
    * @exception   
    * @date        2019/7/22 14:48
    */
    Integer insertPhoneUser(Map map);
}
