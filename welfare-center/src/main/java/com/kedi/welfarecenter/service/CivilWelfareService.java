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
 * @Description 民政福利里接口调用
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/
@FeignClient(value = "app-older-welfare-r", fallback = VolunteerServiceFallBackImpl.class)
public interface CivilWelfareService {
	
    /**
     * @Description:民政福利列表获取
     * @return
     */
    @RequestMapping(value = "/welfare/list", method = RequestMethod.GET)
    List<Map> getCivilWelfareList();
    /**
     * @Description:某一个人的福利详情
     * @param id  福利id
     * @return
     */
    @RequestMapping(value = "/welfare/listone?id={id}", method = RequestMethod.GET)
    Map getCivilWelfareDetail(@RequestParam("id") Integer id);
    
    
    


}
