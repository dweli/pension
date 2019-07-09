package com.kedi.oldlif.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
* @Description: 
* @author: dw 
* @date: 2019 2019年7月4日 下午4:30:21
 */
@FeignClient(value = "app-older-oldlife-w", fallback = ConsumerClientServiceFallBackImpl.class)
public interface OldlifeWriteService {

	/**
     * 
     * @Description  添加养老院的点赞数
     * @Author dw
     * @Date 2019/7/1  17:02
      * Version 1.0
     */
    @RequestMapping(value = "/oldfile/updatePraise?id={id}", method = RequestMethod.GET)
    int addPraiseNum(@RequestParam("id") int id);
    
    /**
     * @Description:添加养老院的收藏数
     * @param id
     * @return 
     */
    @RequestMapping(value = "/oldfile/updateCollection?id={id}", method = RequestMethod.GET)
    int addCollectionNum(@RequestParam("id") int id);
}
