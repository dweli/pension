package com.kedi.elderlyheath.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerClientService
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/
@FeignClient(value = "health-center", fallback = ElderlyFeignServiceFallBackImpl.class)
public interface ElderlyHealthFeignService {

    /**
     * 
     * @Description  
     * @Author dw
     * @Date 2019/7/1  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getelderlyfood/byuserid", method = RequestMethod.GET)
    List<Map> getFood(@RequestParam("olduserid") int olduserid);
    
    


}
