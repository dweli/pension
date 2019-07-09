package com.older.welfare.controller;

import com.older.welfare.service.WelfareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("welfare")
public class WelfareController {
    @Autowired
    private WelfareService welfareService;

    @RequestMapping("/list")
    public List<Map<String,Object>> findALL(){
        List<Map<String, Object>> list = welfareService.selectAll();
        return list;
    }

    @RequestMapping("/listone")
    public List<Map<String,Object>> findById(@RequestParam("id") Integer id){
        List<Map<String, Object>> list = welfareService.selectAllByWelfareId(id);
        return list;
    }

}
