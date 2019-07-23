package com.kedi.usercenter.service.impl;

import com.kedi.usercenter.mapper.UserMapper;
import com.kedi.usercenter.service.RetrievePasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @Description:    找回密码实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:55
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class RetrievePasswordServiceImpl implements RetrievePasswordService {
    @Autowired
    private UserMapper mapper;

    /**
    * 方法实现说明    找回密码
    * @author      ytw
    *@param         mPassword,phone
    * @return      
    * @exception
    * @date        2019/7/22 16:55
    */
    @Transactional(rollbackFor=Exception.class)
    @Override
    public Integer updatePasswordByPhone(String mPassword,String phone) {
        return mapper.updatePasswordByPhone(mPassword,phone);
    }






}
