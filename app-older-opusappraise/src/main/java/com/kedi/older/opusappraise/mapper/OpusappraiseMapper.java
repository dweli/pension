package com.kedi.older.opusappraise.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface OpusappraiseMapper {
    @Select("select user.name as opus_appraisename ,opus_appraise.praise_content from opus_appraise left join opus on opus.opus_id = opus_appraise.opus_id  \n" +
            "left join  user on user.p_user_id =opus_appraise.p_user_id  where opus_appraise.opus_id =#{opusid}")
    List<Map<String,Object>> findList(@Param("opusid") Integer id);
}
