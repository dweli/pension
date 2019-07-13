package com.kedi.benefitwelfare.service;


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
@FeignClient(value = "welfare-center", fallback = HuilaoActiveFeignServiceFallBackImpl.class)
public interface HuilaoActiveFeignService {
    
    @RequestMapping(value = "/huilaoactive/list", method = RequestMethod.GET)
    public List<Map> getHuilaoActiveList();
    
    @RequestMapping(value = "/huilaoactive/detail", method = RequestMethod.GET)
    public Map getHuilaoActiveDetail(@RequestParam("id") Integer id);
}
