package com.kedi.evergreenschoolcenter.feign.service;

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
public class EvergreenSchoolCenterServiceFallBackImpl implements  EvergreenSchoolCenterService{

	@Override
	public List<Map> selectcalss() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> selectonline(int calss) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> selectcommunitysalon() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map> selectcoursereg() {
		// TODO Auto-generated method stub
		return null;
	}

}
