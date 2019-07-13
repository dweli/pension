package com.kedi.importantnews.service;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public class ImportantnewsFallback implements FallbackFactory<ImportantnewsService>{

    private static final Logger LOGGER = LoggerFactory.getLogger(ImportantnewsFallback.class);

    @Override
    public ImportantnewsService create(Throwable throwable) {
        ImportantnewsFallback.LOGGER.info("fallback reason was: {} " ,throwable.getMessage());
        return new UserFeignClientWithFactory() {

            @Override
            public List<Map<String, Object>> findList() {
                return null;
            }

            @Override
            public List<Map<String, Object>> findOneINews(Integer id) {
                return null;
            }
        };
    }
}
