package com.kedi.older.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubscribeMapper {
    
	@Insert("INSERT INTO `Pension`.`subscribe` (`state_wake_one`,`state_wake_two`,`state_wake_three`,`state_wake_four`,`state_wake_five`,`state_wake_six`,`state_wake_seven`,`date_string`,`status`,`borth_time`)" 
     + " VALUES(#{map.state_wake_one},#{map.state_wake_two},#{map.state_wake_three},#{map.state_wake_four}, #{map.state_wake_five},#{map.state_wake_six},#{map.state_wake_seven},#{map.date_string},#{map.status},#{map.borth_time}) ")
    int insertSubscribe(@Param("map")Map map);
}
