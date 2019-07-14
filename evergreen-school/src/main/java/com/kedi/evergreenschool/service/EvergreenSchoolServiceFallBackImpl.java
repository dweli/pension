package com.kedi.evergreenschool.service;

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
public class EvergreenSchoolServiceFallBackImpl implements  EvergreenSchoolFeignService{




	@Override
	public List<Map> getsselectonline() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> getselectcommunitysalon() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> getselectcoursereg() {
		// TODO Auto-generated method stub
		return null;
	}

}
