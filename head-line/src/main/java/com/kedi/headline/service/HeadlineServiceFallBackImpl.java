package com.kedi.headline.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
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
public class HeadlineServiceFallBackImpl implements  HeadlineFeignService{




	@Override
	public List<Map> getHomeNews() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> getInternationnalNews() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> getProvincialNews() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> getAgeNews() {
		// TODO Auto-generated method stub
		return null;
	}

}
