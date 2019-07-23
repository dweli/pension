package com.kedi.aliyun.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.kedi.aliyun.service.SmsService;
import com.kedi.aliyun.util.PhoneCode;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;
/**
* @Description:    短信发送实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 15:26
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class SmsServiceImpl implements SmsService {
    final static Integer  RUNM  = 4;

    @Autowired
   PhoneCode sendPhone;

    @Autowired
    StringRedisTemplate redisTemplate;

    private static final String KEY_PREFIX="user:verify:";

    @Override
    public void sendSms(String phone) throws ClientException {
        if(StringUtils.isBlank(phone)){
            return ;
        }
        String vcode =RandomStringUtils.randomNumeric(4);

        if(StringUtils.isNotBlank(vcode)){
            sendPhone.sendSms(phone,vcode);
        }
        //把验证码保存到redis中
        this.redisTemplate.opsForValue().set(KEY_PREFIX+phone,vcode,1,TimeUnit.MINUTES);
    }


}
