package com.kedi.usercenter.service.impl;


import com.kedi.usercenter.mapper.UserMapper;
import com.kedi.usercenter.service.ModifyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
* @Description:    修改个人信息实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:54
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class ModifyuserImpl implements ModifyuserService {
    @Autowired
    private UserMapper mapper;

    /**
    * 方法实现说明   更新个人信息
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/22 16:54
    */
    @Transactional(rollbackFor=Exception.class)
    @Override
    public Integer updateUserInfo(Map map) {
        mapper.updateCommunityc(map);
        mapper.updateElderly(map);
        return mapper.updateUserInfo(map);
    }

    /**
    * 方法实现说明   更新密码
    * @author      ytw
    *@param             newPassword，idcard
    * @return
    * @exception   
    * @date        2019/7/22 16:54
    */
    @Transactional(rollbackFor=Exception.class)
    @Override
    public Integer updatePassword(String newPassword,String idcard) {

        return  mapper.updatePassword(newPassword,idcard);
    }


}
