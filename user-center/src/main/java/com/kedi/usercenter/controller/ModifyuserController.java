package com.kedi.usercenter.controller;


import com.kedi.usercenter.service.LoginService;
import com.kedi.usercenter.service.ModifyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
* @Description:    更新个人信息
* @Author:         ytw
* @CreateDate:     2019/7/17 15:53
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
public class ModifyuserController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private ModifyuserService service;

    /**
    * 方法实现说明  更改个人信息
    * @author      ytw
    * @param
    * @return
    * @exception   
    * @date        2019/7/17 23:27
    */
    @PostMapping("/user/modifyuserinfo")
    Integer updateUserInfo(@RequestParam("idcard")String idcard, @RequestParam("name")String name,
                           @RequestParam(value="sex" ,required=false) Integer sex,@RequestParam("communitycname") String communitycname){
        Map<String, Object> map = loginService.selectByIdcardfindName(idcard);
        map.put("name",name);
        map.put("sex",sex);
        map.put("idcard",idcard);
        map.put("communityc_name",communitycname);
        return  service.updateUserInfo(map);
        }

        /**
        * 方法实现说明   修改密码
        * @author      ytw
        *@param
        * @return
        * @exception   
        * @date        2019/7/20 23:28
        */
        @PostMapping("/user/modifyuserPassword")
        Integer updateUserPassword(@RequestParam("password") String password,@RequestParam("idcard")String idcard){
            String newPassword = DigestUtils.md5DigestAsHex(password.getBytes());
          return   service.updatePassword(newPassword,idcard);
        }
}
//