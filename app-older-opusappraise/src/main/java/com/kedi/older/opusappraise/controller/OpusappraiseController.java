package com.kedi.older.opusappraise.controller;

import com.kedi.older.opusappraise.service.OpusappraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("opus_appraise")
@RestController
public class OpusappraiseController {
    @Autowired
    private OpusappraiseService service;

    @RequestMapping("/list")
    public List<Map<String,Object>> findList(@RequestParam("opusid") Integer id){
        return service.findList(id);
    }

}
