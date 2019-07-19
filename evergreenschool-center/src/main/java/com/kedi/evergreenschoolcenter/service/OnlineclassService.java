package com.kedi.evergreenschoolcenter.service;

import java.util.List;
import java.util.Map;

public interface OnlineclassService {
	public List<Map<String,Object>> calss();
	public List<Map<String,Object>> online(int calss);
}
