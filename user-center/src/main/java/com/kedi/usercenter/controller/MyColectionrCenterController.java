package com.kedi.usercenter.controller;



import com.kedi.usercenter.service.MyColectionrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 我的收藏控制层
* @author: clx
* @date: 2019 2019年7月12日 下午2:00:59
 */
@RestController
public class MyColectionrCenterController {
    @Autowired
    private MyColectionrService myColectionrCenterFeignService;


    @RequestMapping(value = "/getcolection")
    public List<Map<String,Object>> getcolection(int puserid) {
        return myColectionrCenterFeignService.colection(puserid);
    }

}
