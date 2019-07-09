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
@FeignClient(value = "app-older-job-r", fallback = WelfareServiceFallBackImpl.class)
public interface WelfareService {
	
   /**
    * @Description:返回就业招聘信息
    * @return
    */
    @RequestMapping(value = "/job/list", method = RequestMethod.GET)
    List<Map> getJobList();
    
    /**
     * @Description:根据招聘信息id,返回详细信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/job/detail?id={id}", method = RequestMethod.GET)
    Map getJobDetail(@RequestParam("id") Integer id);
    
    
    


}
