package com.kedi.usercenter.provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
* @Description:    sqlprovider
* @Author:         ytw
* @CreateDate:     2019/7/22 14:39
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class UserProvider {

    public String updateUser(final Map map){
        return new SQL(){
            {
                UPDATE("user");
                if(map.get("role_id")!=null){
                    SET("role_id=#{roleid}");
                }
                if(map.get("name")!=null){
                    SET("name=#{name}");
                }
                WHERE("p_user_id=#{puserid}");
            }
        }.toString();
    }
}
