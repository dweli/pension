package com.kedi.goldenradio.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedi.goldenradio.service.GoldenRadioService;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 长者健康业务层接口
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:01
 * Version 1.0
 **/
@RestController
public class GoldenRadioController {
    @Autowired
    private GoldenRadioService goldenRadioService;

    
    @RequestMapping(value = "/storytelling/getstorytelling")
    public List<Map> getstorytelling() {
    	
        return goldenRadioService.getstorytelling();
    }
    @RequestMapping(value = "/opera/getopera")
    public List<Map> getopera() {
    	
    	return goldenRadioService.getopera();
    }
    @RequestMapping(value = "/music/getmusic")
    public List<Map> getmusic() {
    	
    	return goldenRadioService.getmusic();
    }
    @RequestMapping(value = "/review/getreview")
    public List<Map> getreview() {
    	
    	return goldenRadioService.getreview();
    }

   
}
