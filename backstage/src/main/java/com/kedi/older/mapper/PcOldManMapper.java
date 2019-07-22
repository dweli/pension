package com.kedi.older.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 
 *
 * @ClassName	OldhomeMapper
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:10
 */
@Mapper
public interface PcOldManMapper {
	
	/**
	 * @Description:	根据获取老人相关信息
	 * @param 			part
	 * @return			返回一个封装的数据对象elderlyid
	 */
	@Select("SELECT e.name,e.idcard,e.isactive,v.village_name,v.village_address "  
			+"FROM elderly e "  
			+"LEFT JOIN village v "  
			+"ON e.village_id = v.village_id ")
	List<Map<String, Object>> oldmanpart();
	/**
	 * @Description:	根据老人id获取老人所有信息(详情页)
	 * @param 			elderlyid
	 * @return			返回一个封装数据对象
	 */
	@Select("SELECT e.name,e.idcard,e.isactive, "  
			+"v.village_name,v.village_address, " 
			+"cc.communityc_name, "  
			+"f.information,f.rank AS family_information_rank, "  
			+"c.economic_id,c.rank AS economic_rank, "  
			+"m.name AS medicalinstitution_name,m.medicalinstitution_class, "  
			+"d.name AS disease_name,d.rank AS disease_rank,  "  
			+"s.selfcare_dre,s.rank AS selfcare_rank "  
			+"FROM elderly e "  
			+"LEFT JOIN village v "  
			+"ON e.village_id = v.village_id "  
			+"LEFT JOIN communityc cc "  
			+"ON v.communityc_id = cc.communityc_id "  
			+"LEFT JOIN medicalinstitution m "  
			+"ON cc.communityc_id = m.communityc_id "  
			+"LEFT JOIN family_information f "  
			+"ON e.family_information_id = f.family_information_id "  
			+"LEFT JOIN economic c "  
			+"ON e.economic_id = c.economic_id "  
			+"LEFT JOIN disease d "  
			+"ON e.disease_id = d.disease_id "  
			+"LEFT JOIN selfcare s "  
			+"ON e.selfcare_id = s.selfcare_id "  
			+"WHERE elderly_id = (#{elderlyid})")
	List<Map<String, Object>> oldmanall(@Param("elderlyid")int elderlyid);

	/**
	 * @Description: 根据老人id修改老人表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 */
	@Update("UPDATE elderly  "  
			+"SET family_information_id = (CASE WHEN (#{map.familyinformationid}) IS NULL THEN family_information_id ELSE (#{map.familyinformationid}) END), "  
			+"selfcare_id = (CASE WHEN (#{map.selfcareid}) IS NULL THEN selfcare_id ELSE (#{map.selfcareid}) END), "  
			+"economic_id = (CASE WHEN (#{map.economicid}) IS NULL THEN economic_id ELSE (#{map.economicid}) END), " 
			+"village_id = (CASE WHEN (#{map.villageid}) IS NULL THEN village_id ELSE (#{map.villageid}) END), "  
			+"disease_id = (CASE WHEN (#{map.diseaseid}) IS NULL THEN disease_id ELSE (#{map.diseaseid}) END), "  
			+"name = (CASE WHEN (#{map.name}) IS NULL THEN name ELSE (#{map.name}) END), " 
			+"idcard = (CASE WHEN (#{map.idcard}) IS NULL THEN idcard ELSE (#{map.idcard}) END), " 
			+"isactive = (CASE WHEN (#{map.isactive}) IS NULL THEN isactive ELSE (#{map.isactive}) END) " 
			+"WHERE elderly_id = (#{map.elderlyid});")
	int elderly(@Param("map")Map map);
/*	 /**
	 * @Description: 根据小区id修改小区表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 *//*
	@Update("UPDATE village "  
			+"communityc_id = (CASE WHEN (#{map.communitycid}) IS NULL THEN communityc_id ELSE (#{map.communitycid}) END), "  
			+"village_name = (CASE WHEN (#{map.villagename}) IS NULL THEN village_name ELSE (#{map.villagename}) END), "  
			+"village_address = (CASE WHEN (#{map.villageaddress}) IS NULL THEN village_address ELSE (#{map.villageaddress}) END) "  
			+"WHERE village_id = (#{map.villageid});")
	int village(@Param("map")Map map);
	 /**
	 * @Description: 根据社区id修改社区表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 *//*
	@Update("UPDATE communityc "  
			+"SET communityc_name = (CASE WHEN (#{map.communitycname}) IS NULL THEN communityc_name ELSE (#{map.communitycname}) END) "  
			+"WHERE communityc_id = (#{map.communitycid});")
	int communityc(@Param("map")Map map);
	/**
	 * @Description: 根据家庭情况id修改家庭情况表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 *//*
	@Update("UPDATE family_information  "  
			+"SET information = (CASE WHEN (#{map.information}) IS NULL THEN information ELSE (#{map.information}) END), "  
			+"rank = (CASE WHEN (#{map.rank}) IS NULL THEN rank ELSE (#{map.rank}) END) "  
			+"WHERE family_information_id = (#{map.familyinformation_id});")
	int family_information(@Param("map")Map map);
	/**
	 * @Description: 根据经济情况id修改经济情况表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 *//*
	@Update("UPDATE economic  "  
			+"SET economic_condition = (CASE WHEN (#{map.economiccondition}) IS NULL THEN economic_condition ELSE (#{map.economiccondition}) END), "
			+"rank = (CASE WHEN (#{map.rank}) IS NULL THEN rank ELSE (#{map.rank}) END) " 
			+"WHERE economic_id = (#{map.economicid});")
	int economic(@Param("map")Map map);
	/**
	 * @Description: 根据疾病id修改疾病表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 *//*
	@Update("UPDATE disease  "  
			+"SET name = (CASE WHEN (#{map.name}) IS NULL THEN name ELSE (#{map.name}) END), "
			+"rank = (CASE WHEN (#{map.rank}) IS NULL THEN rank ELSE (#{map.rank}) END) "
			+"WHERE disease_id = (#{map.diseaseid});")
	int disease(@Param("map")Map map);
	/**
	 * @Description: 根据自理程度id修改自理程度表信息
	 * @param 		 map
	 * @return		 返回一个封装的map对象
	 *//*
	@Update("UPDATE selfcare  " 
			+"SET selfcare_dre = (CASE WHEN (#{map.selfcaredre}) IS NULL THEN selfcare_dre ELSE (#{map.selfcaredre}) END), " 
			+"rank = (CASE WHEN (CASE WHEN (#{map.rank}) IS NULL THEN rank ELSE (CASE WHEN (#{map.rank}) END) "
			+"WHERE selfcare_id = (CASE WHEN (#{map.selfcareid});")
	int selfcare(@Param("map")Map map);
	/**
	 * @Description:创建社区名
	 * @param 		map
	 * @return		返回一个封装的map对象
	 *//*
	@Insert("INSERT communityc "  
		   +"(communityc_name) VALUES ((#{map.communitycname}))")
	int icommunityc(@Param("map")Map map);
	/**
	 * @Description:创建小区详细信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 *//*
	@Insert("INSERT village "  
			+"(communityc_id,village_name,village_address)  "  
			+"VALUE  "  
			+"((#{map.communitycid}),(#{map.villagename}),(#{map.villageaddress}))")
	int ivillage(@Param("map")Map map);
	/**
	 * @Description:创建家庭情况信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 *//*
	@Insert("INSERT family_information " 
			+"(information,rank)  "  
			+"VALUE  " 
			+"((#{map.information}),(#{map.rank}))")
	int ifamilyinformation(@Param("map")Map map);
	/**
	 * @Description:创建经济情况信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 *//*
	@Insert("INSERT economic "
			+"(economic_condition,rank)  "  
			+"VALUE  " 
			+"((#{map.economiccondition}),(#{map.rank}))")
	int ieconomic(@Param("map")Map map);
	/**
	 * @Description:创建疾病情况信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 *//*
	@Insert("INSERT disease "  
			+"(name,rank)  " 
			+"VALUE  "  
			+"((#{map.name}),(#{map.rank}))")
	int idisease(@Param("map")Map map);
	/**
	 * @Description:创自理程度情况信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 *//*
	@Insert("INSERT selfcare "  
			+"(selfcare_dre,rank)  " 
			+"VALUE  " 
			+"((#{map.selfcaredre}),(#{map.rank}))")
	int iselfcare(@Param("map")Map map); */
	/**
	 * @Description:创建自理程度情况信息
	 * @param 		map
	 * @return		返回一个封装的map对象
	 */
	@Insert("INSERT elderly "  
			+"(family_information_id,selfcare_id,economic_id, "  
			+"village_id,disease_id,name,idcard,isactive)  "  
			+"VALUE  "  
			+"((#{map.familyinformation_id}),(#{map.selfcareid}),(#{map.economicid}),(#{map.villageid}),"
			+"(#{map.diseaseid}),(#{map.name}),(#{map.idcard}),(#{map.isactive}))")
	int ielderly(@Param("map")Map map);
}
