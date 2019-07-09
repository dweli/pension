package com.kedi.benefitwelfare.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

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
public class ElderlyEmploymenFeignServiceFallBackImpl implements  ElderlyEmploymenFeignService{



	@Override
	public List<Map> getJobList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Map getJobDetail(@RequestParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
