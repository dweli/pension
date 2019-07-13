package com.kedi.importantnews.controller;

import com.kedi.importantnews.service.ImportantnewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
* @Description:    重要消息服务控制层
* @Author:         ytw
* @CreateDate:     2019/7/12 15:15
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
public class ImportantnewsController {
    @Autowired
    private ImportantnewsService importantnewsService;

    /**
    * 方法实现说明 获取重要消息列表
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 15:16
    */
    @RequestMapping("/news/importentnews/list")
    public List<Map<String, Object>> findList(){
        return   importantnewsService.findList();
    }

    /**
    * 方法实现说明 根据用户id获取重要消息
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 15:16
    */
    @RequestMapping("/news/importentnews/listOne")
    public List findOneINews(@RequestParam("puserid") Integer id){
        return   importantnewsService.findOneINews(id);
    }
}
