package com.kedi.usercenter.service.impl;


import com.kedi.usercenter.mapper.UserMapper;
import com.kedi.usercenter.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
* @Description:    用户注册实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:57
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class UserRegisterImpl implements UserRegisterService {
    @Autowired
    private UserMapper mapper;
/**
* 方法实现说明  检验数据是否可用
* @author      ytw
*@param
* @return      
* @exception   
* @date        2019/7/17 0:21
*/
    @Override
    public Boolean checkUser(String loginname, String phone) {
        Integer name = mapper.selectByloginname(loginname);
        Integer iPhone = mapper.selectByPhone(phone);
        if(name!=null&&iPhone!=null){
                return false;
        } else {
                return true;
        }
        }




    @Transactional(rollbackFor=Exception.class)
    @Override
    public Integer insertUser(Map map) {

            Integer integer1 = mapper.insertUser(map);
          return mapper.insertPhone(map);

        }

    @Transactional(rollbackFor=Exception.class)
    @Override
    public Integer insertPhoneUser(Map map) {

        return mapper.insertPhoneUser(map);
    }



}
