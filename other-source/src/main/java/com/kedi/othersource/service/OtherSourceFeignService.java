package com.kedi.othersource.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerClientService
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/
@FeignClient(value = "othersource-center", fallback = OtherSourceServiceFallBackImpl.class)
public interface OtherSourceFeignService {

    /**
     * 
     * @Description  
     * @Author dw
     * @Date 2019/7/1  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getothersource", method = RequestMethod.GET)
    List<Map> getothersource();
    
    


}
