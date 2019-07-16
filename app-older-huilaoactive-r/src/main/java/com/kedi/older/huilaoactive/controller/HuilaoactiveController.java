package com.kedi.older.huilaoactive.controller;

import com.kedi.older.huilaoactive.service.HuilaoactiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("huilaoactive")
@RestController
public class HuilaoactiveController {

    @Autowired
    private HuilaoactiveService huilaoactive;

    @RequestMapping("/list")
    public List<Map<String,Object>> findList(){
        return huilaoactive.findList();
    }

    @RequestMapping("detail")
    public Map<String,Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = huilaoactive.findDetail(id);
        return list;
    }
}
