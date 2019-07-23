package com.kedi.aliyun.util;


import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.springframework.stereotype.Component;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @Description:    短息服务实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 15:16
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Component
public class PhoneCode implements Serializable{

   static final String PRODUCT = StaticPeram.PRODUCT;
   static final String DOMAIN = StaticPeram.DOMAIN;
    static final String ACCESSKEYID = StaticPeram.ACCESSKEYID;
    static final String ACCESSKEYSECRET = StaticPeram.ACCESSKEYSECRET;
    static final String OK=StaticPeram.OK;


    /**
     * 阿里云短信服务配置
     * @param mobile
     * @return
     */
    public  SendSmsResponse  sendSms(String mobile,String code) throws ClientException{
        System.setProperty(StaticPeram.DEFAULTCONNECTTIMEOUT, StaticPeram.TIMEOUT);
        System.setProperty(StaticPeram.DEFAULTREADTIMEOUT, StaticPeram.TIMEOUT);
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou",ACCESSKEYID , ACCESSKEYSECRET);
        try {
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", PRODUCT,DOMAIN);
        } catch (ClientException e1) {
            e1.printStackTrace();
        }

        IAcsClient asclient = new DefaultAcsClient(profile);
        SendSmsRequest request = new SendSmsRequest();
        request.setMethod(MethodType.POST);
        request.setPhoneNumbers(mobile);
        request.setSignName(StaticPeram.SIGNNAME);
        request.setTemplateCode(StaticPeram.TEMPLATECODE);

        request.setTemplateParam("{ \"code\":\""+code+"\"}");
          SendSmsResponse sendSmsResponse=null;
        try {
             sendSmsResponse = asclient.getAcsResponse(request);
            if (sendSmsResponse.getCode() != null
                    && sendSmsResponse.getCode().equals(OK)) {
                // 请求成功
                System.out.println("获取验证码成功！！！");

                }
        } catch (ServerException e) {
            e.printStackTrace();

        }
        return sendSmsResponse;
    }

    public  QuerySendDetailsResponse querySendDetails(String bizId,String mobile) throws ClientException {

        System.setProperty(StaticPeram.DEFAULTCONNECTTIMEOUT, StaticPeram.TIMEOUT);
        System.setProperty(StaticPeram.DEFAULTREADTIMEOUT, StaticPeram.TIMEOUT);

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", ACCESSKEYID, ACCESSKEYSECRET);
        try {
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", PRODUCT,DOMAIN);
        } catch (ClientException e1) {
            e1.printStackTrace();
        }
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象
        QuerySendDetailsRequest request = new QuerySendDetailsRequest();
        //必填-号码
        request.setPhoneNumber(mobile);
        //可选-流水号
        request.setBizId(bizId);
        //必填-发送日期 支持30天内记录查询，格式yyyyMMdd
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        request.setSendDate(ft.format(new Date()));
        //必填-页大小
        request.setPageSize(10L);
        //必填-当前页码从1开始计数
        request.setCurrentPage(1L);

        QuerySendDetailsResponse querySendDetailsResponse=null;
        try {
            querySendDetailsResponse = acsClient.getAcsResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();

        }
        return querySendDetailsResponse;
    }

}
