package com.kedi.older.servie;

import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

/**
* @Description:    点赞和收藏+1servcie层
* @Author:         ytw
* @CreateDate:     2019/7/12 9:50
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface OldLifeService {
	/**
	 * @author dw
	 * @Description:dffff
	 * @Date 2019/7/12 9:50
	 * @param id
     * @return
	 */
    List<Map<String,Object>> findBedList();
    /**
     * @Description:更改床位点赞数
     * @param id
     * @return
     */
    int updatePraise(Integer id); 
    /**
     * @Description:更改床位收藏数
     * @param id
     * @return
     */
    int updateCollection(Integer id);
}
