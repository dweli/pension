package com.kedi.aliyun.util;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
* @Description:    session  创建 删除 获取sessionid
* @Author:         ytw
* @CreateDate:     2019/7/22 15:01
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MySessionContext {
    private static MySessionContext instance;
    private HashMap<String,HttpSession> sessionMap;

    private MySessionContext() {
        sessionMap = new HashMap<String,HttpSession>();

    }

    public static MySessionContext getInstance() {
        if (instance == null) {
            instance = new MySessionContext();
        }
        return instance;
    }

    public synchronized void addSession(HttpSession session) {
        if (session != null) {
            sessionMap.put(session.getId(), session);
        }
    }

    public synchronized void delSession(HttpSession session) {
        if (session != null) {
            sessionMap.remove(session.getId());
        }
    }

    public synchronized HttpSession getSession(String sessionId) {
        if (sessionId == null) {
            return null;
        }
        return sessionMap.get(sessionId);
    }

}
