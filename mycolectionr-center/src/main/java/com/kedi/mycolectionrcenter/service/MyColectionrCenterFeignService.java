package com.kedi.mycolectionrcenter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author clx
 * @Date 2019/7/12  14:10
 * Version 1.0
 **/
@FeignClient(value = "app-old-mycolectionr-r", fallback = MyColectionrCenterServiceFallBackImpl.class)
public interface MyColectionrCenterFeignService {
	
   /**
    * @Description:根据用户id获取收藏对应的关系表
    * @param puserid
    * @return
    */
    @RequestMapping(value = "/selectcolection", method = RequestMethod.GET)
    List<Map> selectcolection(@RequestParam("puserid") int puserid);
    
    
    


}
