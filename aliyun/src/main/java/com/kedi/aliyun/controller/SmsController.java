package com.kedi.aliyun.controller;

import com.aliyuncs.exceptions.ClientException;
import com.kedi.aliyun.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


/**
* @Description:    发送短信
* @Author:         ytw
* @CreateDate:     2019/7/22 14:51
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class SmsController {

    @Autowired
    SmsService smsService;
    
    /**
    * 方法实现说明  发送电话
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/22 14:52
    */
    @ResponseBody
    @PostMapping("/aliyun/getVerificationCode")
    public ResponseEntity<Void> smsPhone(@RequestParam("phone") String phone) throws ClientException {
        smsService.sendSms(phone);
        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
