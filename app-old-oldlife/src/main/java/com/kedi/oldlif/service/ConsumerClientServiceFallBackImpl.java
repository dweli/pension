package com.kedi.oldlif.service;

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
public class ConsumerClientServiceFallBackImpl implements  ConsumerClientService{



    @Override
    public List<Map> get() {
        return new ArrayList<>();
    }


	@Override
	public List<Map> getBeadelderly(int minprice, int maxprice) {
		// TODO Auto-generated method stub
		return null;
	}

}
