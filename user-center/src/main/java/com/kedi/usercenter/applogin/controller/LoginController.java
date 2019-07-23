package com.kedi.usercenter.applogin.controller;


import com.kedi.usercenter.config.UserConfig;
import com.kedi.usercenter.service.LoginService;
import com.kedi.usercenter.utils.ResultVoUtil;
import com.kedi.usercenter.vo.ResultVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @Description:    登录控制层
* @Author:         ytw
* @CreateDate:     2019/7/22 16:52
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class LoginController {
    @Autowired
    private LoginService service;
    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    UserConfig config;

/**
* 方法实现说明  根据手机和密码进行登录
* @author      ytw
*@param
* @return
* @exception   
* @date        2019/7/16 17:18
*/
    @ResponseBody
    @PostMapping("/user/loginByPassword")
    ResultVo loginByPhoneAndPs(@RequestParam("password") String password, @RequestParam("phone") String phone){
        String mPassword = DigestUtils.md5DigestAsHex(password.getBytes());
        Integer res = service.selectByNameAndPs(mPassword, phone);
        if(res==null){
            return null;
        }else {
            return ResultVoUtil.success();
        }
    }

    /**
    * 方法实现说明  根据手机和验证码进行登录
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/16 17:18
    */
    @ResponseBody
    @PostMapping("/user/loginByPhoneAndCode")
    ResultVo loginByPhoneAndCode(@RequestParam("phone") String phone, @RequestParam("securitycode")String securitycode){
        String redisCode = redisTemplate.opsForValue().get(config.getkeyPrefix() + phone);
        if(!StringUtils.equals(redisCode,securitycode)){
            return ResultVoUtil.error(0,"验证码不匹配");
        }
        Integer res = service.selectByPhoneAndcode(phone);
        if(res==null){
            return null;
        }else {
            return ResultVoUtil.success();
        }

    }



}
