package com.kedi.mokuai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
/**
 * 
 * @ClassName UserMapper
 * @Author 陈辽逊
 * @Time 2019年7月3日 上午11:12:43
 */
@Mapper
public interface MyColectionrMapper {
	
	@Select("SELECT u.p_user_id, " 
			+"o.`name` AS opus_name,o.price AS opus_price,o.collectionnum, " 
			+"oo.address,oo.width AS opusource_width,oo.height AS opusource_height, " 
			+"m.`name` AS commodity_name,m.price AS commodity_price, " 
			+"g.imageadress,g.width AS goodsimage_width,g.height AS goodsimage_height, " 
			+"f.`name` AS oldlife_name,f.url,f.collection_num " 
			+"FROM user u " 
			+"LEFT JOIN colection c " 
			+"ON u.p_user_id = c.p_user_id " 
			+"LEFT JOIN opus o " 
			+"ON c.opus_id = o.opus_id " 
			+"LEFT JOIN opusource oo " 
			+"ON o.opus_id = oo.opus_id " 
			+"LEFT JOIN business b " 
			+"ON c.business_id = b.business_id " 
			+"LEFT JOIN commodity m " 
			+"ON c.commodity_id =m.commodity_id " 
			+"LEFT JOIN goodsimage g " 
			+"ON m.commodity_id = g.commodity_id " 
			+"LEFT JOIN oldlife f " 
			+"ON c.oldlife_id = f.oldlife_id " 
			+"WHERE u.p_user_id =(#{puserid})")
	List<Map<String, Object>> colection(@Param("puserid")int puserid);

}
