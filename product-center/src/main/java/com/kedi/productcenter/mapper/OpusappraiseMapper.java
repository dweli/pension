package com.kedi.productcenter.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
/**
* @Description:    商品评论 mapper接口
* @Author:         ytw
* @CreateDate:     2019/7/22 16:01
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Mapper
public interface OpusappraiseMapper {
    /**
    * 方法实现说明   根据id查找说有商品评论
    * @author      ytw
    *@param          id
    * @return
    * @exception   
    * @date        2019/7/22 16:01
    */
    @Select("select user.name as opus_appraisename ,opus_appraise.praise_content,opus.online_status from opus_appraise left join opus on opus.opus_id = opus_appraise.opus_id  \n" +
            "left join  user on user.p_user_id =opus_appraise.p_user_id  where opus_appraise.opus_id =#{opusid}")
    List<Map<String,Object>> findList(@Param("opusid") Integer id);
}
