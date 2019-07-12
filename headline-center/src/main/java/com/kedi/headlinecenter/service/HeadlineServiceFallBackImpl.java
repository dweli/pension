package com.kedi.headlinecenter.service;

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
public class HeadlineServiceFallBackImpl implements  HeadlineService{

	@Override
	public List<Map> selecthomenews() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> selectinternationalnews() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> selectprovincialnews() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> selectagenews() {
		// TODO Auto-generated method stub
		return null;
	}

}