package com.kedi.productcenter.controller;
import com.kedi.productcenter.service.BlsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
* @Description:    商品控制层
* @Author:         ytw
* @CreateDate:     2019/7/12 10:32
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
public class BlsController {

    @Autowired
    private BlsProductService blsProductService;

    /**
    * 方法实现说明 获取所有商品
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/11 11:27
    */
    @RequestMapping(value="/opus/list", method = RequestMethod.GET)
    public List<Map<String,Object>> getOpusList(){
        List<Map<String, Object>> opusList = blsProductService.findList();
        return opusList;
    }

    /**
    * 方法实现说明  根据状态获取商品列表
    * @author      ytw
    *@param         num
    * @return      list
    * @exception
    * @date        2019/7/11 11:27
    */
    @RequestMapping(value = "/opus/partlist", method = RequestMethod.GET)
    List<Map<String,Object>> getOpusPartList(@RequestParam("num") Integer num){
      return   blsProductService.findbyStatus(num);
    }

    /**
    * 方法实现说明  获取商品详情
    * @author      ytw
    *@param         id
    * @return
    * @exception
    * @date        2019/7/11 11:28
    */
    @RequestMapping(value="/opus/detail", method = RequestMethod.GET)
    Map<String,Object> getOpusDetail(@RequestParam("id") Integer id){

        return blsProductService.findDetail(id);
    }




}
