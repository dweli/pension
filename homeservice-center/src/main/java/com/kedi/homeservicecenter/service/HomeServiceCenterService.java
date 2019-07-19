package com.kedi.homeservicecenter.service;


import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:02
 * Version 1.0
 **/
public interface HomeServiceCenterService {
	
   /**
    * @Description:根据用户id获取对应健康标签与对应食物的关系表
    * @param puserid
    * @return
    */
    List<Map> selectBusinessCommodity(); 
    
    Map<String,Object> getCommodityDetailbyid(Integer id);

}
