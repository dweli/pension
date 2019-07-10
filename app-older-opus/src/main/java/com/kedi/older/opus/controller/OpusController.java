package com.kedi.older.opus.controller;

import com.kedi.older.opus.service.OpusService;
import com.kedi.older.opus.utils.ResultVOUtil;
import com.kedi.older.opus.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("opus")
@RestController
public class OpusController {

    @Autowired
    private OpusService service;

    @RequestMapping("/list")
    public List<Map<String, java.lang.Object>>  findList(){
        return service.findList();
    }

    @RequestMapping("/partlist")
    public List<Map<String,Object>> findByStutas(@RequestParam("num") Integer num){
        List<Map<String, Object>> list = service.findbyStatus(num);
        return list;
    }

    @RequestMapping("/detail")
    public Map<String,Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = service.findDetail(id);
        return list;
    }

    @PostMapping("/createopus")
    public ResultVo insertopus(@RequestParam("puserid") Integer puserid,@RequestParam("name") String name,@RequestParam("price") Integer price,
                               @RequestParam("weight") Float weight,@RequestParam("uploadUser") Integer uploadUser,
                               @RequestParam("imgaddress") String address){
        Integer opusid = service.insertopus(puserid, name, price, weight, uploadUser);
        service.insertopusource(opusid,address);
        return ResultVOUtil.success();
    }

}
