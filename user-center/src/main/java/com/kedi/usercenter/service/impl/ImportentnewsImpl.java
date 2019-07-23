package com.kedi.usercenter.service.impl;

import com.kedi.usercenter.mapper.ImportentnewsMapper;
import com.kedi.usercenter.service.ImportentnewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @Description:    重要消息实现类
* @Author:         ytw
* @CreateDate:     2019/7/22 16:51
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class ImportentnewsImpl implements ImportentnewsService {
    @Autowired
    private ImportentnewsMapper mapper;
    /**
    * 方法实现说明  查找所有
    * @author      ytw
    *@param
    * @return      
    * @exception   
    * @date        2019/7/22 16:52
    */
    @Override
    public List<Map<String, Object>> findList() {
        return mapper.findList();
    }

    /**
    * 方法实现说明  查找一个
    * @author      ytw
    *@param         id
    * @return
    * @exception   
    * @date        2019/7/22 16:52
    */
    @Override
    public List<Map<String, Object>> findOne(Integer id) {
        return mapper.findOne(id);
    }
}
