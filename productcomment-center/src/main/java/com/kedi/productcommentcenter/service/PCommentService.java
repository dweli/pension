package com.kedi.productcommentcenter.service;

import com.kedi.productcommentcenter.config.ServiceFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
/**
* @Description:    feign调用 app-older-opusappraise服务
* @Author:         ytw
* @CreateDate:     2019/7/12 10:35
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@FeignClient(value ="app-older-opusappraise",configuration = ServiceFeignConfiguration.class)
public interface PCommentService {

    @RequestMapping("/opus_appraise/list")
    public List<Map<String,Object>> findList(@RequestParam("opusid") Integer id);
}
