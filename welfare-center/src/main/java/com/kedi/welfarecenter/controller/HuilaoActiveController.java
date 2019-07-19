package com.kedi.welfarecenter.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;








import com.kedi.welfarecenter.service.HuilaoActiveService;

import java.util.List;
import java.util.Map;

/**
 * 
* @Description: 惠老活动
* @author: dw 
* @date: 2019 2019年7月9日 下午4:34:09
 */
@RestController
public class HuilaoActiveController {
	 @Autowired
	    private HuilaoActiveService huilaoActiveController;
	   

	    @RequestMapping(value = "/huilaoactive/list")
	    public List<Map<String,Object>> getHuilaoActiveList() {
	    	
	        return huilaoActiveController.getHuilaoActiveList();
	    }
	    @RequestMapping(value = "/huilaoactive/detail")
	    public Map getHuilaoActiveDetail(Integer id) {
	    	
	    	return huilaoActiveController.getHuilaoActiveDetail(id);
	    }
  
   
}
