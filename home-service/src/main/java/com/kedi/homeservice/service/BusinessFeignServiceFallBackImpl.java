package com.kedi.homeservice.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerClientServiceFallBack
 * @Description
 * @Author clx
 * @Date 2019/7/1  17:03
 * Version 1.0
 **/
@Component
public class BusinessFeignServiceFallBackImpl implements  BusinessHealthFeignService{




	@Override
	public List<Map> getBusiness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> getclassname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatebusiness(Map map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean insertmerchant(Map map) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Map<String, Object> getCommodityDetailbyid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
