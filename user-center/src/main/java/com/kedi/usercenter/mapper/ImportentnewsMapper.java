package com.kedi.usercenter.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
/**
* @Description:    重要消息mapper
* @Author:         ytw
* @CreateDate:     2019/7/22 16:42
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Mapper
public interface ImportentnewsMapper {

    /**
    * 方法实现说明  根据用户查找 重要消息
    * @author      ytw
    *@param         id
    * @return      
    * @exception   
    * @date        2019/7/22 16:43
    */
    @Select("select i.content,i.newstime,i.url from importentnews i left join user on i.p_user_id = user.p_user_id where user.p_user_id=#{id}")
    List<Map<String, Object>> findOne(@Param("id") Integer id);

    /**
    * 方法实现说明   查找所有重要消息
    * @author      ytw
    *@param
    * @return
    * @exception   
    * @date        2019/7/22 16:44
    */
    @Select("select i.content,i.newstime,i.url from importentnews i")
    List<Map<String,Object>> findList();
}
