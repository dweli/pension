package com.older.welfare.controller;

import com.older.welfare.service.WelfareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
* @Description:    民政福利控制层
* @Author:         ytw
* @CreateDate:     2019/7/12 10:23
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RestController
@RequestMapping("welfare")
public class WelfareController {
    @Autowired
    private WelfareService welfareService;

    /**
    * 方法实现说明  民政福利列表查询
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:24
    */
    @RequestMapping("/list")
    public List<Map<String,Object>> findALL(){
        List<Map<String, Object>> list = welfareService.selectAll();
        return list;
    }

    /**
    * 方法实现说明  根据主键id 民政福利详情查询
    * @author      ytw
    *@param
    * @return
    * @exception
    * @date        2019/7/12 10:24
    */
    @RequestMapping("/listone")
    public Map<String, Object> findById(@RequestParam("id") Integer id){
        Map<String, Object> list = welfareService.selectAllByWelfareId(id);
        return list;
    }

}
