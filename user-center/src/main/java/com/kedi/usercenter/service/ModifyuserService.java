package com.kedi.usercenter.service;

import java.util.Map;

/**
* @Description:    更改信息
* @Author:         ytw
* @CreateDate:     2019/7/22 14:44
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface ModifyuserService {
    /**
    * 方法实现说明  更改个人信息
    * @author      ytw
    *@param         map
    * @return      
    * @exception   
    * @date        2019/7/22 14:45
    */
    Integer updateUserInfo(Map map);

    /**
    * 方法实现说明  修改密码
    * @author      ytw
    *@param         newPassword,idcard
    * @return
    * @exception   
    * @date        2019/7/22 14:45
    */
    Integer updatePassword(String newPassword, String idcard);
}
