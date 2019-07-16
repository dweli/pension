package com.kedi.mokuai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.MusicService;



/**
 * 
 *
 * @ClassName 	MusicController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 11:09
 */
@Controller
public class MusicController {
	
	 @Autowired
	    public MusicService service;

	 /**
	  * @Description: 获取前台提交的参数，指定映射方法名为/selectmusic
	  * @return		    返回一个数据对象	
	  */
	 @RequestMapping("/selectmusic")
	    @ResponseBody
	    public List<Map<String, Object>> selectmusic() {
	    	List<Map<String,Object>> userid = service.music();
			return userid;	  
	    }
}
