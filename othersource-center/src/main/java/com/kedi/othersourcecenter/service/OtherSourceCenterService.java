package com.kedi.othersourcecenter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/
@FeignClient(value = "app-old-othersource-r", fallback = OtherSourceCenterServiceFallBackImpl.class)
public interface OtherSourceCenterService {
	
   /**
    * @Description:根据用户id获取对应健康标签与对应食物的关系表
    * @param puserid
    * @return
    */
    @RequestMapping(value = "/selectothersource", method = RequestMethod.GET)
    List<Map> selectothersource();
    
   
    


}
