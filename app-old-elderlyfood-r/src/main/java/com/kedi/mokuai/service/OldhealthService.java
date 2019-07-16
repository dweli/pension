package com.kedi.mokuai.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.kedi.mokuai.dao.OldhealthMapper;

/**
 * 
 * @ClassName		OldhealthService
 * @author: 		陈辽逊
 * @date: 			2019/7/13 10:12
 */
public class OldhealthService {

	private static final Logger logger = LoggerFactory.getLogger(OldhealthService.class);

	@Autowired
	public OldhealthMapper mapper;

	/**
	 * @return			返回一个olduserid数据对象的id值
	 */
	public List<Map<String, Object>> olduserid(int olduserid) {

		if (isNAN(olduserid)) {
			logger.info("查询成功");
		}else {
			logger.error("查询失败");
		}
		return mapper.olduserid(olduserid);
	}

	private boolean isNAN(int olduserid) {
		return true;
	}

}
