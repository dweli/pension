package com.kedi.newscenter.controller;

import com.kedi.newscenter.service.ImportentnewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
/**
* @Description:    重要新闻中心控制层
* @Author:         ytw
* @CreateDate:     2019/7/12 14:35
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
public class ImportentnewsController {

    @Autowired
    private ImportentnewsService importentnewsService;

    /**
    * 方法实现说明  获取所有重要信息
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 14:35
    */
    @RequestMapping("/news/importentnews/list")
    public List<Map<String, Object>> findList(){
        return   importentnewsService.findList();
    }

    /**
    * 方法实现说明 根据用户id获取消息
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 14:38
    */
    @RequestMapping("/news/importentnews/listOne")
    public List<Map<String, Object>> findOneINews(@RequestParam("id") Integer id){
      return   importentnewsService.getOneImportentnes(id);
    }
}
