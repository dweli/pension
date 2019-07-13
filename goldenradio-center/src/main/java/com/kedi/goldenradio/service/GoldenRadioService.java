package com.kedi.goldenradio.service;


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
 * @Description
 * @Author clx
 * @Date 2019/7/11  16:52
 * Version 1.0
 **/
@FeignClient(value = "app-old-Goldenradio-r", fallback = GoldenRadioServiceFallBackImpl.class)
public interface GoldenRadioService {
	
   /**
    * @Description:获取评书所有信息表
    * @return
    */
    @RequestMapping(value = "/selectstorytelling", method = RequestMethod.GET)
    List<Map> selectstorytelling();
    /**
     * @Description:表
     * @return
     */
    @RequestMapping(value = "/selectopera", method = RequestMethod.GET)
    List<Map> selectopera();
    /**
     * @Description:表
     * @return
     */
    @RequestMapping(value = "/selectmusic", method = RequestMethod.GET)
    List<Map> selectmusic();
    /**
     * @Description:表
     * @return
     */
    @RequestMapping(value = "/selectreview", method = RequestMethod.GET)
    List<Map> selectreview();
    
   
    


}
