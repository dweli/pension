package com.kedi.older.opusappraise.controller;

import com.kedi.older.opusappraise.service.OpusappraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
* @Description:    商品评论controller层
* @Author:         ytw
* @CreateDate:     2019/7/12 10:18
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RequestMapping("opus_appraise")
@RestController
public class OpusappraiseController {
    @Autowired
    private OpusappraiseService service;

    /**
    * 方法实现说明 查询所有评论
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:19
    */
    @RequestMapping("/list")
    public List<Map<String,Object>> findList(@RequestParam("opusid") Integer id){
        return service.findList(id);
    }

}
