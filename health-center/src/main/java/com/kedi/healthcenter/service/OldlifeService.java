package com.kedi.healthcenter.service;

import java.util.List;
import java.util.Map;


/**
 * 
* @Description: 床位预约接口
* @author: dw 
* @date: 2019 2019年7月22日 下午5:27:19
 */
public interface OldlifeService {
	/**
	 * @Description:查询床位列表展示
	 * @return  返回床位信息
	 */
	List<Map<String, Object>> findBedList();
	/**
	 * @Description:   根据价格搜索床位
	 * @param minprice   最低价格
	 * @param maxprice   最高价格
	 * @return    返回床位信息
	 */
	List<Map<String, Object>> oldprice(int minprice,int maxprice);
}
