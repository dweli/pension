package com.kedi.older.volunteer.controller;

import com.kedi.older.volunteer.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("volunteer")
@RestController
public class VolunteerController {
    @Autowired
    private VolunteerService service;

    @RequestMapping("/list")
    public List<Map<String,Object>>  findList(){
        return service.findList();
    }

    @RequestMapping("/detail")
    public Map<String,Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = service.findDetail(id);
        return list;
    }
}
