package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OldhealthService;


/**
 * 
 *
 * @ClassName	OldhealthController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:33
 */
@Controller
public class OldhealthController {
	
	 @Autowired
	    public OldhealthService service;

	 /**
	  * @Description:	获取前台提交的参数，指定映射方法名为/selectpuser
	  * @param 			olduserid
	  * @return			olduserid数据对象的id
	  */
	  @RequestMapping("/selectpuser")
	    @ResponseBody
	    public List<Map<String, Object>> selectpuser(int olduserid) {
	    	List<Map<String,Object>> userid = service.olduserid(olduserid);
			return userid; 
	    }
}
