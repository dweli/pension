package com.kedi.older.volunteer.controller;

import com.kedi.older.volunteer.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
/**
* @Description:    志愿者
* @Author:         ytw
* @CreateDate:     2019/7/12 10:20
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RequestMapping("volunteer")
@RestController
public class VolunteerController {
    @Autowired
    private VolunteerService service;

    /**
    * 方法实现说明  志愿者列表查询
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:20
    */
    @RequestMapping("/list")
    public List<Map<String,Object>>  findList(){
        return service.findList();
    }

    /**
    * 方法实现说明  志愿者详情查询
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:21
    */
    @RequestMapping("/detail")
    public Map<String,Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = service.findDetail(id);
        return list;
    }
}
