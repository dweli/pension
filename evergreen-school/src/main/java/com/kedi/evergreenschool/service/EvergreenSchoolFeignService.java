package com.kedi.evergreenschool.service;


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
 * @Author clx
 * @Date 2019/7/11  16:26
 * Version 1.0
 **/
@FeignClient(value = "evergreenschool-center", fallback = EvergreenSchoolServiceFallBackImpl.class)
public interface EvergreenSchoolFeignService {

    /**
     * 
     * @Description  获取在线课堂的所有信息表
     * @Author clx
     * @Date 2019/7/1  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getsselectonline", method = RequestMethod.GET)
    List<Map> getsselectonline();
    /**
     * 
     * @Description  获取社区沙龙的所有信息
     * @Author clx
     * @Date 2019/7/1  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getselectcommunitysalon", method = RequestMethod.GET)
    List<Map> getselectcommunitysalon();
    /**
     * 
     * @Description  获取课程报名的所有信息表
     * @Author clx
     * @Date 2019/7/1  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getselectcoursereg", method = RequestMethod.GET)
    List<Map> getselectcoursereg();
    
    


}
