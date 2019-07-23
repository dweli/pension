package com.kedi.usercenter.service.impl;


import com.kedi.usercenter.mapper.UserMapper;
import com.kedi.usercenter.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @Description:    登录实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:53
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper mapper;
    /**
    * 方法实现说明  根据身份证 查找社区id
    * @author      ytw
    *@param         idcard
    * @return
    * @exception   
    * @date        2019/7/18 23:29
    */
    @Override
    public Map<String,Object> selectByIdcardfindName(String idcard) {
        Map<String,Object> map = mapper.selectByIdcardfindName(idcard);
        return map;
    }

    /**
    * 方法实现说明  根据电话查找用户id
    * @author      ytw
    *@param         phone
    * @return
    * @exception   
    * @date        2019/7/20 23:31
    */
    @Override
    public Integer selectByPhoneAndcode(String phone) {
        Integer integer = mapper.selectByPhone(phone);
        return integer;
    }
        /**
        * 方法实现说明  根据电话和密码登录
        * @author      ytw
        *@param                 phone
        * @return
        * @exception   
        * @date        2019/7/20 23:32
        */
    @Override
    public Integer selectByNameAndPs(String mPassword, String phone) {
        Integer integer = mapper.selectByNameAndPs(mPassword, phone);
        return integer;
    }


}
