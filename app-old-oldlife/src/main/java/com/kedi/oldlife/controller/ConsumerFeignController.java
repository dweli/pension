package com.kedi.oldlife.controller;


import com.kedi.oldlif.service.ConsumerClientService;
import com.kedi.oldlif.service.OldlifeWriteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerController_Feign
 * @Description
 * @Author ytw
 * @Date 2019/7/1  17:01
 * Version 1.0
 **/
@RestController
public class ConsumerFeignController {
    @Autowired
    private ConsumerClientService consumerClientService;
    @Autowired
    private OldlifeWriteService oldlifeWrite;

    

    @RequestMapping(value = "/getbeadhouse_list")
    public List<Map> get() {
        return consumerClientService.get();
    }
    @RequestMapping(value = "/getbeadhouse_list/byprice")
    public List<Map> get(int minprice,int maxprice) {
    	
        return consumerClientService.getBeadelderly(minprice, maxprice);
    }
    @RequestMapping(value = "/addCollectionNum")
    public int addCollectionNum(int id) {
    	return oldlifeWrite.addCollectionNum(id);
    }
    @RequestMapping(value = "/addPraiseNum")
    public int addPraiseNum(int id) {
    	return oldlifeWrite.addPraiseNum(id);
    }

   
}
