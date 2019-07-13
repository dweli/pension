package com.kedi.goldenradio.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.goldenradio.service.GoldenRadioService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 金色广播控制层
* @author: dw 
* @date: 2019 2019年7月8日 下午2:00:59
 */
@RestController
public class GoldenRadioController {
    @Autowired
    private GoldenRadioService elderlyHealthService;
   

    @RequestMapping(value = "/getstorytelling")
    public List<Map> getstorytelling() {
    	
        return elderlyHealthService.selectstorytelling();
    }
    @RequestMapping(value = "/getopera")
    public List<Map> getopera() {
    	
    	return elderlyHealthService.selectopera();
    }
    @RequestMapping(value = "/getmusic")
    public List<Map> getmusic() {
    	
    	return elderlyHealthService.selectmusic();
    }
    @RequestMapping(value = "/getreview")
    public List<Map> getreview() {
    	
    	return elderlyHealthService.selectreview();
    }

   
}
