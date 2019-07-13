package com.kedi.older.job.controller;

import com.kedi.older.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
* @Description:    长者就业信息的查询
* @Author:         ytw
* @CreateDate:     2019/7/12 9:42
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RequestMapping("job")
@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    /**
    * 方法实现说明  查询所有信息
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:43
    */
    @RequestMapping("/list")
    public List<Map<String,Object>> findALL(){
        List<Map<String, Object>> list = jobService.findList();
        return list;
    }

    /**
    * 方法实现说明  查询详情
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 9:43
    */
    @RequestMapping("/detail")
    public Map<String,Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = jobService.findDetail(id);
        return list;
    }
}
