package com.kedi.welfarecenter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description 惠老活动接口调用
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/
@FeignClient(value = "app-older-huilaoactive-r", fallback = VolunteerServiceFallBackImpl.class)
public interface HuilaoActiveService {
	
    /**
     * @Description:惠老活动列表获取
     * @return
     */
    @RequestMapping(value = "/huilaoactive/list ", method = RequestMethod.GET)
    List<Map> getHuilaoActiveList();
    /**
     * @Description:根据id获取惠老活动详情
     * @param id  活动id
     * @return
     */
    @RequestMapping(value = "/huilaoactive/detail", method = RequestMethod.GET)
    Map getHuilaoActiveDetail(@RequestParam("id") Integer id);
    
    
    


}
