package com.kedi.homeservice.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerClientService
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:02
 * Version 1.0
 **/
@FeignClient(value = "homeservice-center", fallback = BusinessFeignServiceFallBackImpl.class)
public interface BusinessHealthFeignService {

    /**
     * 
     * @Description  
     * @Author clx
     * @Date 2019/7/11  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getbusinesscommodity", method = RequestMethod.GET)
    List<Map> getBusiness();
    
    


}
