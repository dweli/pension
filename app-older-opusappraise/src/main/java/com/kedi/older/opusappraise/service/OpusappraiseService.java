package com.kedi.older.opusappraise.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @Description:    商品评论service层
* @Author:         ytw
* @CreateDate:     2019/7/12 10:19
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface OpusappraiseService {
    List<Map<String,Object>> findList(@Param("opusid") Integer id);
}
