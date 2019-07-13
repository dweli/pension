package com.kedi.newscenter.service;

import com.kedi.newscenter.config.ServiceFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
* @Description:    重要消息服务层feign调用底层
* @Author:         ytw
* @CreateDate:     2019/7/12 14:18
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@FeignClient(value ="app-older-importentnews",configuration = ServiceFeignConfiguration.class)
public interface ImportentnewsService {

    /**
    * 方法实现说明 查找所有重要消息
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 14:39
    */
    @RequestMapping(value = "/importentnews/list", method = RequestMethod.GET)
    List<Map<String,Object>> findList();

    /**
    * 方法实现说明  根据用户id获取消息
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 14:40
    */
    @RequestMapping("/importentnews/listOne")
    List<Map<String, Object>> getOneImportentnes(@RequestParam("id") Integer id);

}
