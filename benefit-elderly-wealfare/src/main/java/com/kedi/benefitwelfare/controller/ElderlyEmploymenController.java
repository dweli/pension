package com.kedi.benefitwelfare.controller;


import com.kedi.benefitwelfare.service.ElderlyEmploymenFeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description 老人就业业务层接口
 * @Author dw
 * @Date 2019/7/1  17:01
 * Version 1.0
 **/
@RestController
public class ElderlyEmploymenController {
    @Autowired
    private ElderlyEmploymenFeignService elderlyEmploymenFeignService;
    /**
     * @Description:获取老人就业单位列表
     * @return
     */
    @RequestMapping(value = "/job/list")
    public List<Map> getJobList() {
        return elderlyEmploymenFeignService.getJobList();
    }
    /**
     * @Description:根据id，获取详细的就业招聘情况
     * @param id  就业信息id
     * @return
     */
    @RequestMapping(value = "/job/detail", method = RequestMethod.GET)
    public Map getJobDetail(Integer id){
		
    	return elderlyEmploymenFeignService.getJobDetail(id);
    };

   
}
