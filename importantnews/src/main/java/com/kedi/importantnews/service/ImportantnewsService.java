package com.kedi.importantnews.service;

import com.kedi.importantnews.config.ServiceFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value="news-center",configuration = ServiceFeignConfiguration.class)
public interface ImportantnewsService {

    @RequestMapping("/news/importentnews/list")
    List<Map<String, Object>> findList();

    @RequestMapping("/news/importentnews/listOne")
    List<Map<String, Object>> findOneINews(@RequestParam("id") Integer id);

}
