package com.kedi.older.opus.controller;

import com.kedi.older.opus.service.OpusService;
import com.kedi.older.opus.utils.ResultVOUtil;
import com.kedi.older.opus.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    老人商品控制层
* @Author:         ytw
* @CreateDate:     2019/7/12 9:52
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RequestMapping("opus")
@RestController
public class OpusController {

    @Autowired
    private OpusService service;

    /**
    * 方法实现说明 `查询所有商品
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:53
    */
    @RequestMapping("/list")
    public List<Map<String, java.lang.Object>>  findList(){
        return service.findList();
    }

    /**
    * 方法实现说明
    * @author      根据状态：已上传 成交 等 查询商品列表
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:53
    */
    @RequestMapping("/partlist")
    public List<Map<String,Object>> findByStutas(@RequestParam("num") Integer num){
        List<Map<String, Object>> list = service.findbyStatus(num);
        return list;
    }

    /**
    * 方法实现说明  根据ID查询商品详情
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:54
    */
    @RequestMapping("/detail")
    public Map<String,Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = service.findDetail(id);
        return list;
    }

    /**
    * 方法实现说明 上传作品
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:55
    */
    @PostMapping("/createopus")
    public ResultVo insertopus(@RequestParam("puserid") Integer puserid,@RequestParam("name") String name,@RequestParam("price") Integer price,
                               @RequestParam("weight") Float weight,@RequestParam("uploadUser") Integer uploadUser,
                               @RequestParam("imgaddress") String address){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("opus_id",-1);
        map.put("puserid",puserid);
        map.put("name",name);
        map.put("price",price);
        map.put("weight",weight);
        map.put("uploadUser",uploadUser);
        map.put("address",address);
        service.createOpus(map);
        return ResultVOUtil.success();
    }



}
