package com.kedi.productcenter.service;


import com.kedi.productcenter.config.ServiceFeignConfiguration;
import com.kedi.productcenter.vo.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;


/**
* @Description:    比南山商品服务
* @Author:         ytw
* @CreateDate:     2019/7/11 10:38
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

@FeignClient(value ="app-older-opus",configuration = ServiceFeignConfiguration.class)
public interface BlsProductService {

    /**
    * 方法实现说明
    * @author      ytw
    * @param
    * @return
    * @exception
    * @date        2019/7/11 10:20
    */
    @RequestMapping(value = "/opus/list", method = RequestMethod.GET)
    List<Map<String,Object>> getOpusList();

    /**
    * 方法实现说明
    * @author      ytw
    * @param       num
    * @return
    * @exception
    * @date        2019/7/11 10:25
    */
    @RequestMapping(value = "/opus/partlist", method = RequestMethod.GET)
    List<Map<String,Object>> getPartList(@RequestParam("num") Integer num);

    /**
    * 方法实现说明
    * @author      ytw
    *@param         id
    * @return
    * @exception
    * @date        2019/7/11 10:30
    */
    @RequestMapping(value="/opus/detail", method = RequestMethod.GET)
    Map<String,Object> getDetail(@RequestParam("id") Integer id);

    /**
    * 方法实现说明
    * @author      ytw
    *@param     puserid,name,price,weight,uploadUser,address
    * @return
    * @exception
    * @date        2019/7/11 10:37
    */
    @RequestMapping(value="/opus/createopus", method = RequestMethod.POST)
    ResultVo createopus(@RequestParam("puserid") Integer puserid, @RequestParam("name") String name, @RequestParam("price") Integer price,
                        @RequestParam("weight") Float weight, @RequestParam("uploadUser") Integer uploadUser,
                        @RequestParam("imgaddress") String address);
}
