package com.kedi.homeservicecenter.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerClientServiceFallBack
 * @Description
 * @Author clx
 * @Date 2019/7/11  17:03
 * Version 1.0
 **/
@Component
public class HomeServiceCenterServiceFallBackImpl implements  HomeServiceCenterFeignService{

	@Override
	public List<Map> selectBusinessCommodity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getCommodityDetailbyid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
