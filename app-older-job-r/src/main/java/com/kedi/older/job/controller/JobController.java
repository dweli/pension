package com.kedi.older.job.controller;

import com.kedi.older.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("job")
@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @RequestMapping("/list")
    public List<Map<String,Object>> findALL(){
        List<Map<String, Object>> list = jobService.findList();
        return list;
    }

    @RequestMapping("/detail")
    public Map<String,Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = jobService.findDetail(id);
        return list;
    }
}
