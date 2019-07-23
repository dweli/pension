package com.kedi.productcenter.service.impl;

import com.kedi.productcenter.mapper.BlsMapper;
import com.kedi.productcenter.service.BlsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
/**
* @Description:    比南山商品 实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:02
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class BlsProductServiceImpl implements  BlsProductService{

    @Autowired
    BlsMapper mapper;
        
    /**
    * 方法实现说明  查找所有商品
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/22 16:03
    */
    @Override
    public List<Map<String, Object>> findList() {
        return mapper.findList();
    }

    /**
    * 方法实现说明  根据
    * @author      ytw
    *@param        num
    * @return
    * @exception   
    * @date        2019/7/22 16:04
    */
    @Override
    public List<Map<String, Object>> findbyStatus(Integer num) {
        return mapper.findbyStatus(num);
    }

    /**
    * 方法实现说明
    * @author      ytw
    *@param         id
    * @return
    * @exception   
    * @date        2019/7/22 16:15
    */
    @Override
    public Map<String, Object> findDetail(Integer id) {
        return mapper.findDetail(id);
    }


}
