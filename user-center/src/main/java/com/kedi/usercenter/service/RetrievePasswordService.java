package com.kedi.usercenter.service;


/**
* @Description:
* @Author:         ytw
* @CreateDate:     2019/7/22 14:45
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface RetrievePasswordService {

    /**
    * 方法实现说明  找回密码
    * @author      ytw
    *@param         mPassword,phone
    * @return
    * @exception   
    * @date        2019/7/22 14:46
    */
    Integer updatePasswordByPhone(String mPassword,String phone);
}
