package com.kedi.homeservicecenter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RequestParam;

import feign.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName 
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:02
 * Version 1.0
 **/
@FeignClient(value = "backstage", fallback = MerchantCenterServiceFallBackImpl.class)
public interface MerchantCenterFeignService {
	

	/**
	 * @Description: 根据商家类型获取对应所有信息数据
	 * @param name
	 * @return（展示方法参数和返回值）
	 */
    @RequestMapping(value = "/selectclassname", method = RequestMethod.GET)
    List<Map> selectclassname(@RequestParam("name") String name);
    
    /**
     * @Description: 根据商家id进行更新
     * @param map
     * @return（展示方法参数和返回值）
     */
    @RequestMapping(value = "/updatebusiness", method = RequestMethod.POST)
    int updatebusiness(@RequestParam("map") Map map);
    /**
     * @Description: 创建商家
     * @param map
     * @return（展示方法参数和返回值）
     */
    @RequestMapping(value = "/insertmerchant", method = RequestMethod.POST)
    boolean insertmerchant(@RequestParam("map") Map map);

}
