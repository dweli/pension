package com.kedi.homeservice.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ConsumerClientServiceFallBack
 * @Description
 * @Author ytw
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

}
