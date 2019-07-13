package com.kedi.bilanshan.controller;


import com.kedi.bilanshan.service.BilanshanProCommentService;
import com.kedi.bilanshan.service.BilanshanService;
import com.kedi.bilanshan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
* @Description:    比南山业务层接口
* @Author:         ytw
* @CreateDate:     2019/7/12 9:37
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
public class BilanshanController {

    @Autowired
    private BilanshanService bilanshanService;

    @Autowired
    private BilanshanProCommentService bilanshanProCommentService;

    /**
    * 方法实现说明
    * @author      查询商品评论
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:38
    */
    @RequestMapping(value="/opus_appraise/list", method = RequestMethod.GET)
    List<Map<String,Object>> getProCommentList(@RequestParam("id") Integer id){
        List<Map<String, Object>> opusList = bilanshanProCommentService.findList(id);
        return opusList;
    }




    /**
    * 方法实现说明  查询所有商品
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/11 11:27
    */

    @RequestMapping(value="/opus/list", method = RequestMethod.GET)
    List<Map<String,Object>> getOpusList(){
        List<Map<String, Object>> opusList = bilanshanService.getOpusList();
        return opusList;
    }

    /**
    * 方法实现说明   根据状态查询商品
    * @author      ytw
    *@param         num
    * @return      list
    * @exception
    * @date        2019/7/11 11:27
    */
    @RequestMapping(value = "/opus/partlist", method = RequestMethod.GET)
    List<Map<String,Object>> getOpusPartList(@RequestParam("num") Integer num){
      return   bilanshanService.getPartList(num);
    }

    /**
    * 方法实现说明  根据主键id查询商品详情
    * @author      ytw
    *@param         id
    * @return
    * @exception
    * @date        2019/7/11 11:28
    */
    @RequestMapping(value="/opus/detail", method = RequestMethod.GET)
    Map<String,Object> getOpusDetail(@RequestParam("id") Integer id){
       return bilanshanService.getDetail(id);
    }

    /**
    * 方法实现说明   商品提交申请 插入数据库
    * @author      ytw
    *@param         puserid,name,price,weight,uploadUser,address
    * @return
    * @exception
    * @date        2019/7/11 11:28
    */
    @RequestMapping(value="/opus/createopus", method = RequestMethod.POST)
    ResultVo createopus(@RequestParam("puserid") Integer puserid, @RequestParam("name") String name,
                        @RequestParam("price") Integer price,
                        @RequestParam("weight") Float weight, @RequestParam("uploadUser") Integer uploadUser,
                        @RequestParam("imgaddress") String address){
        ResultVo resultVo = bilanshanService.createopus(puserid, name, price, weight, uploadUser, address);
        return resultVo;
    }
}
