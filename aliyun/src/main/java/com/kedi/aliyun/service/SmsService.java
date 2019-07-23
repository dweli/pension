package com.kedi.aliyun.service;

import com.aliyuncs.exceptions.ClientException;


import java.util.Map;

/**
* @Description:    aliyun service层
* @Author:         ytw
* @CreateDate:     2019/7/22 14:53
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface SmsService {
   /**
   * 方法实现说明
   * @author      ytw
   *@param        phone
   * @return      发送短信service
   * @exception    ClientException
   * @date        2019/7/22 15:23
   */
   void  sendSms(String phone) throws ClientException;
}
