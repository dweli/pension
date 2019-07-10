package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.MusicService;


/**
 * 
 * @author 陈辽逊
 *
 */
@Controller
public class MusicController {
	
	 @Autowired
	    public MusicService service;

	 @RequestMapping("/selectmusic")
	    @ResponseBody
	    public List<Map<String, Object>> selectmusic() throws Throwable, IOException {
	    	System.out.println("进入了方法4");
	    	List<Map<String,Object>> userid = service.music();
			return userid;	  
	    }
}
