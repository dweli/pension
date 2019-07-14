package com.kedi.older.importentnews.controller;

import com.kedi.older.importentnews.service.ImportentnewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
* @Description:    获取重要消息控制层
* @Author:         ytw
* @CreateDate:     2019/7/12 13:37
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
public class ImportentnewsController {

    @Autowired
    private ImportentnewsService service;

    /**
    * 方法实现说明 获取重要消息列表
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 13:38
    */
    @RequestMapping("/news/importentnews/list")
    public List<Map<String, Object>> findList(){
      return   service.findList();
    }

    /**
    * 方法实现说明 根据用户id获取 消息
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 13:38
    */
    @GetMapping("/news/importentnews/listOne")
    List<Map<String, Object>> findByUserId(@RequestParam("id") Integer id){
        return  service.findOne(id);
    }

    }
