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
 * @ClassName ConsumerClientService
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:00
 * Version 1.0
 **/
@FeignClient(value = "goldenradio-center", fallback = GoldenRadioServiceFallBackImpl.class)
public interface GoldenRadioService {

    /**
     * 
     * @Description  获取评书所有信息表
     * @Author clx
     * @Date 2019/7/11  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getstorytelling", method = RequestMethod.GET)
    List<Map> getstorytelling();
    /**
     * 
     * @Description  获取评书所有信息表
     * @Author clx
     * @Date 2019/7/11  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getopera", method = RequestMethod.GET)
    List<Map> getopera();
    /**
     * 
     * @Description  获取评书所有信息表
     * @Author clx
     * @Date 2019/7/11  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getmusic", method = RequestMethod.GET)
    List<Map> getmusic();
    /**
     * 
     * @Description  获取评书所有信息表
     * @Author clx
     * @Date 2019/7/11  17:02
     * Version 1.0
     */
    @RequestMapping(value = "/getreview", method = RequestMethod.GET)
    List<Map> getreview();
    
    


}
