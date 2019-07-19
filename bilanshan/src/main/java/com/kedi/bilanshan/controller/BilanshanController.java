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
* @Description:    姣斿崡灞变笟鍔″眰鎺ュ彛
* @Author:         ytw
* @CreateDate:     2019/7/12 9:37
* @UpdateRemark:   淇敼鍐呭
* @Version:        1.0
*/
@RestController
public class BilanshanController {

    @Autowired
    private BilanshanService bilanshanService;

    @Autowired
    private BilanshanProCommentService bilanshanProCommentService;

    /**
    * 鏂规硶瀹炵幇璇存槑
    * @author      鏌ヨ鍟嗗搧璇勮
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
    * 鏂规硶瀹炵幇璇存槑  鏌ヨ鎵�鏈夊晢鍝�
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
    * 鏂规硶瀹炵幇璇存槑   鏍规嵁鐘舵�佹煡璇㈠晢鍝�
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
    * 鏂规硶瀹炵幇璇存槑  鏍规嵁涓婚敭id鏌ヨ鍟嗗搧璇︽儏
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
    * 鏂规硶瀹炵幇璇存槑   鍟嗗搧鎻愪氦鐢宠 鎻掑叆鏁版嵁搴�
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
