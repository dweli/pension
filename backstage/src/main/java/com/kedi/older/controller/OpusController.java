package com.kedi.older.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;


import com.kedi.older.base.BaseController;
import com.kedi.older.servie.OpusService;

@RestController
public class OpusController extends BaseController {
	@Autowired
	OpusService opusService;
	/**
	 * @Description: 对作品的添加
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/publishopus", method =RequestMethod.POST)
	public String publishOpus(@RequestParam Map map){
		
		int opus = opusService.insertOpus(map);
		if(opus==1){
			return SUCCESS;
		}else{
			return FALSE;
		}
	}
	
	/**
	 * @Description: 对作品的更改
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/updateopus/notnull", method =RequestMethod.POST)
	public String updateOpus(@RequestParam Map map){
		
		int opus = opusService.updateOpusByNotNull(map);
		if(opus==1){
			return SUCCESS;
		}else{
			return FALSE;
		}
	}
	/**
	 * @Description: 对作品的删除
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/deleteopusbyid", method =RequestMethod.POST)
	public String deleteOpus(@RequestParam int  other_source_id){
		
		int opus = opusService.deleteOpus(other_source_id);
		if(opus==1){
			return SUCCESS;
		}else{
			return FALSE;
		}
	}
	
	
	@RequestMapping(value = "/fileUpload",method =RequestMethod.POST)
    public String fileUpload(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request) {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "D://temp-rainy//"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = "/temp-rainy/" + fileName;
        model.addAttribute("filename", filename);
        return "file";
    }

}
