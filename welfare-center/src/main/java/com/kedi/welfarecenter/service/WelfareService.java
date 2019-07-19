package com.kedi.welfarecenter.service;


import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/

public interface WelfareService {
	
   /**
    * @Description:返回就业招聘信息
    * @return
    */
    List<Map> getJobList();
    
    /**
     * @Description:根据招聘信息id,返回详细信息
     * @param id
     * @return
     */
    Map getJobDetail(@RequestParam("id") Integer id);
    
    
    


}
