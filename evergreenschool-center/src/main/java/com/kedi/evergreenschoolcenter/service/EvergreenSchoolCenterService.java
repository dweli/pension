package com.kedi.evergreenschoolcenter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:02
 * Version 1.0
 **/
@FeignClient(value = "app-old-evergreenschool-r", fallback = EvergreenSchoolCenterServiceFallBackImpl.class)
public interface EvergreenSchoolCenterService {
	
   /**
    * @Description:获取在线课堂的所有信息表
    * @return
    */
    @RequestMapping(value = "/selectonline", method = RequestMethod.GET)
    List<Map> selectonline();
    /**
     * @Description:社区沙龙的所有信息表
     * @return
     */
    @RequestMapping(value = "/selectcommunitysalon", method = RequestMethod.GET)
    List<Map> selectcommunitysalon();
    /**
     * @Description:课程报名的所有信息所有信息表
     * @return
     */
    @RequestMapping(value = "/selectcoursereg", method = RequestMethod.GET)
    List<Map> selectcoursereg();
    
   
    


}
