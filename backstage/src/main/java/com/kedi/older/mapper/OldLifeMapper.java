package com.kedi.older.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;
/**
* @Description:    点赞和收藏+1  sql语句
* @Author:         ytw
* @CreateDate:     2019/7/12 9:49
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Mapper
public interface OldLifeMapper {
	/**
	 * 返回床位信息
	 */
    @Select("SELECT * FROM `bed_oldlife` order by oldlife_id")
    List<Map<String, Object>> findBedList();
    
    /**
	 * 对养老院的点赞数添加
	 */
    @Update("UPDATE oldlife SET praise_points=praise_points+1  " +
            " WHERE oldlife_id=#{id}")
    int updatePraise(@Param("id") Integer id);
    
    /**
	 * 对养老院的收藏数添加
	 */
    @Update("UPDATE oldlife SET collection_num=collection_num+1  " +
            " WHERE oldlife_id=#{id}")
    int updateCollection(@Param("id") Integer id);


}
