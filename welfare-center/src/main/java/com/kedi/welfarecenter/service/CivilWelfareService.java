package com.kedi.welfarecenter.service;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description 民政福利里接口调用
 * @Author dw
 * @Date 2019/7/1  17:02
 * Version 1.0
 **/

public interface CivilWelfareService {
	
    /**
     * @Description:民政福利列表获取
     * @return
     */
	List<Map<String,Object>>  getCivilWelfareList();
    /**
     * @Description:某一个人的福利详情
     * @param id  福利id
     * @return
     */
    Map getCivilWelfareDetail(@RequestParam("id") Integer id);
    
    
    


}
