package com.kedi.bilanshan.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
* @Description:    商品评论servcie层
* @Author:         ytw
* @CreateDate:     2019/7/12 9:40
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@FeignClient(value ="productcomment-center")
public interface BilanshanProCommentService {

    @RequestMapping("/opus_appraise/list")
    public List<Map<String,Object>> findList(@RequestParam("opusid") Integer id);
}
