package com.kedi.usercenter.controller;


import com.google.common.collect.Maps;
import com.kedi.usercenter.config.UserConfig;
import com.kedi.usercenter.service.UserRegisterService;
import com.kedi.usercenter.utils.ResultVoUtil;
import com.kedi.usercenter.vo.ResultVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
* @Description:    注册
* @Author:         ytw
* @CreateDate:     2019/7/22 14:43
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class RegisterController {

    @Autowired
    private UserRegisterService service;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    UserConfig config;

    //用户调用短信接口  电话放入redis中  这里就根据 电话去取  跟传入的验证码 进行比对
    /**
    * 方法实现说明 注册用户
    * @author      ytw
    *@param
    * @return      
    * @exception   
    * @date        2019/7/20 23:34
    */
    @ResponseBody
    @PostMapping("/user/Register")
    public ResultVo userRegister(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
                                 @RequestParam("idcard") String idcard, @RequestParam("phone") String phone,
                                 @RequestParam("securitycode")String securitycode){
        String redisCode = redisTemplate.opsForValue().get(config.getkeyPrefix() + phone);
        if(!StringUtils.equals(redisCode,securitycode)){
            return ResultVoUtil.error(0,"验证码不匹配");
        }
        Boolean checkresult = service.checkUser(loginname, phone);
        if(checkresult.equals(false)){
            return  ResultVoUtil.error(0,"用户已存在");
        }
        String mPassword = DigestUtils.md5DigestAsHex(password.getBytes());
        Map<String, Object> map = Maps.newHashMapWithExpectedSize(10);
        map.put("loginname",loginname);
        map.put("password",mPassword);
        map.put("idcard",idcard);
        map.put("code",phone);
        map.put("p_user_id",-1);
        map.put("p_phone_id",-1);
        service.insertUser(map);
        service.insertPhoneUser(map);
        return ResultVoUtil.success();
    }
    

}
