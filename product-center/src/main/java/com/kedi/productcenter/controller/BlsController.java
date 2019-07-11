package com.kedi.productcenter.controller;

import com.kedi.productcenter.service.BlsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BlsController {

    @Autowired
    private BlsProductService blsProductService;

    /**
    * 方法实现说明
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/11 11:27
    */
    @RequestMapping(value="/opus/list", method = RequestMethod.GET)
    public List<Map<String,Object>> getOpusList(){
        List<Map<String, Object>> opusList = blsProductService.getOpusList();
        return opusList;
    }

    /**
    * 方法实现说明
    * @author      ytw
    *@param         num
    * @return      list
    * @exception
    * @date        2019/7/11 11:27
    */
    @RequestMapping(value = "/opus/partlist", method = RequestMethod.GET)
    List<Map<String,Object>> getOpusPartList(@RequestParam("num") Integer num){
      return   blsProductService.getPartList(num);
    }

    /**
    * 方法实现说明
    * @author      ytw
    *@param         id
    * @return
    * @exception
    * @date        2019/7/11 11:28
    */
    @RequestMapping(value="/opus/detail", method = RequestMethod.GET)
    Map<String,Object> getOpusDetail(@RequestParam("id") Integer id){
       return blsProductService.getDetail(id);
    }

    /**
    * 方法实现说明
    * @author      ytw
    *@param         puserid,name,price,weight,uploadUser,address
    * @return
    * @exception
    * @date        2019/7/11 11:28
    */
    @RequestMapping(value="/opus/createopus", method = RequestMethod.POST)
    Integer createopus(@RequestParam("puserid") Integer puserid, @RequestParam("name") String name, @RequestParam("price") Integer price,
                        @RequestParam("weight") Float weight, @RequestParam("uploadUser") Integer uploadUser,
                        @RequestParam("imgaddress") String address){
     Integer i=   blsProductService.createopus(puserid,name,price,weight,uploadUser,address);
     return i;

    }
}
