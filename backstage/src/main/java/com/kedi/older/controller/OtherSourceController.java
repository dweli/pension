package com.kedi.older.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import org.springframework.web.bind.annotation.RestController;

import com.kedi.older.base.BaseController;
import com.kedi.older.servie.OthersourceService;
@RestController
public class OtherSourceController extends BaseController {
	@Autowired
	OthersourceService othersourceService;
	
	@RequestMapping(value="/publishothersource", method =RequestMethod.POST)
	public String publishOthersource(@RequestBody Map map){
		
		int othersource = othersourceService.insertOthersource(map);
		if(othersource==1){
			return SUCCESS;
		}else{
			return FALSE;
		}
	}
	@RequestMapping(value="/updateothersource/notnull", method =RequestMethod.POST)
	public String updateOthersource(@RequestParam Map map){
		
		int othersource = othersourceService.updateOthersourceByNotNull(map);
		if(othersource==1){
			return SUCCESS;
		}else{
			return FALSE;
		}
	}
	@RequestMapping(value="/deletebyid", method =RequestMethod.POST)
	public String deleteOthersource(@RequestParam int  other_source_id){
		
		int othersource = othersourceService.deleteOthersource(other_source_id);
		if(othersource==1){
			return SUCCESS;
		}else{
			return FALSE;
		}
	}

}
