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
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/
@FeignClient(value = "app-older-volunteer-r", fallback = VolunteerServiceFallBackImpl.class)
public interface VolunteersService {
	
   /**
    * @Description:返回自愿者列表
    * @return
    */
    @RequestMapping(value = "/volunteer/list", method = RequestMethod.GET)
    List<Map> getJobVolunteerList();
    
    /**
     * @Description:根据id，返回志愿者详细信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/volunteer/detail?id={id}", method = RequestMethod.GET)
    Map getVolunteerDetail(@RequestParam("id") Integer id);
    
    
    


}
