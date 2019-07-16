package com.kedi.mokuai.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedi.mokuai.service.OtherSourceService;


/**
 * 
 *
 * @ClassName	OtherSourceController
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:41
 */
@Controller
public class OtherSourceController{
	
	 @Autowired
	    public OtherSourceService service;

	 /**
	  * @Description:（方法功能描述）
	  * @return
	  */
	    @RequestMapping("/selectothersource")
	    @ResponseBody

	    public List<Map<String, Object>> selectothersource() throws Throwable, IOException {
	    	List<Map<String,Object>> users = service.othersource();
	        return users;	    
	    } 
	    /**
	     * @Description: 肿瘤基因的发布
	     * @return
	     * @throws Throwable
	     * @throws IOException
	     */
	    @RequestMapping("/publish/othersource")
	    @ResponseBody
	    public String othersource(@RequestParam Map map)  {
	    	service.insertOthersource(map);
	    	return null;
	    } 

}
