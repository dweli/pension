package com.kedi.productcenter.service;



import java.util.List;
import java.util.Map;

/**
* @Description:    feign调用 app-older-opusappraise服务
* @Author:         ytw
* @CreateDate:     2019/7/12 10:35
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public interface OpusCommentService {


     /**
     * 方法实现说明 根据商品id 查询评论
     * @author      ytw
     *@param        id
     * @return
     * @exception   
     * @date        2019/7/22 14:35
     */
     List<Map<String,Object>> findList(Integer id);
}
