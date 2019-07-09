package com.kedi.oldlif.service;


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
@FeignClient(value = "app-old-oldlife-r", fallback = ConsumerClientServiceFallBackImpl.class)
public interface ConsumerClientService {
	/**
     * 
     * @Description  获取所有养老院的信息
     * @Author dw
     * @Date 2019/7/1  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    List<Map> get();
    /**
     * 
     * @Description  获取所有养老院的信息
     * @Author dw
     * @Date 2019/7/1  17:02
     * Version 1.0
     */
    @RequestMapping(value = "selectoldprice?minprice={minprice}&maxprice={maxprice}", method = RequestMethod.GET)
    List<Map> getBeadelderly(@RequestParam("minprice") int minprice,@RequestParam("maxprice") int maxprice);
    
    


}
