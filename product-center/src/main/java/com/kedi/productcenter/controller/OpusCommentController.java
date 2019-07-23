package com.kedi.productcenter.controller;


import com.kedi.productcenter.service.OpusCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
* @Description:    查询所有评论
* @Author:         ytw
* @CreateDate:     2019/7/12 10:34
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
public class OpusCommentController {

    @Autowired
    private OpusCommentService service;

    /**
    * 方法实现说明  根据商品id 获取商品评论
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/22 14:34
    */
    @RequestMapping("/opus_appraise/list")
    public List<Map<String,Object>> findList(@RequestParam("opusid") Integer id){
        return service.findList(id);
    }
}
