package com.kedi.productcenter.service.impl;


import com.kedi.productcenter.mapper.OpusappraiseMapper;
import com.kedi.productcenter.service.OpusCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @Description:    商品评论实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:16
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class OpusCommentServiceImpl implements OpusCommentService {
    @Autowired
    OpusappraiseMapper mapper;

    /**
    * 方法实现说明  根据商品id查找所有商品评论
    * @author      ytw
    *@param        id
    * @return
    * @exception   
    * @date        2019/7/22 16:16
    */
    @Override
    public List<Map<String, Object>> findList(Integer id) {
        return mapper.findList(id);
    }
}
