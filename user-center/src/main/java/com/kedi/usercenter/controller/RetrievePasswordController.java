package com.kedi.usercenter.controller;

import com.kedi.usercenter.config.UserConfig;
import com.kedi.usercenter.service.LoginService;
import com.kedi.usercenter.service.RetrievePasswordService;
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
* @Description:    找回密码
* @Author:         ytw
* @CreateDate:     2019/7/22 14:44
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class RetrievePasswordController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private RetrievePasswordService retrievePasswordService;

    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    UserConfig config;
    
    /**
    * 方法实现说明  找回密码
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/20 22:47
    */
    @ResponseBody
    @PostMapping("/user/retrievePassword")
    ResultVo retrievePassword(@RequestParam("password") String password,@RequestParam("phone") String phone, @RequestParam("securitycode")String securitycode){
        String redisCode = redisTemplate.opsForValue().get(config.getkeyPrefix() + phone);
        if(!StringUtils.equals(redisCode,securitycode)){
            return ResultVoUtil.error(0,"验证码不匹配");
        }
        String mPassword = DigestUtils.md5DigestAsHex(password.getBytes());
        Integer res = loginService.selectByNameAndPs(mPassword, phone);
        if(res==null){
            return ResultVoUtil.error(0,"用户不存在");
        }else {
            Integer integer = retrievePasswordService.updatePasswordByPhone(mPassword, phone);
            if (integer!=1){
                return ResultVoUtil.error(0,"用户更新密码失败");
            }
            return ResultVoUtil.success();
        }


    }
}
