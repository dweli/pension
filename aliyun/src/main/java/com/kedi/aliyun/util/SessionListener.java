package com.kedi.aliyun.util;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
* @Description:    session监听
* @Author:         ytw
* @CreateDate:     2019/7/22 15:02
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@WebListener
public class SessionListener implements HttpSessionListener {
    private MySessionContext mySessionContext=MySessionContext.getInstance();

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        mySessionContext.addSession(session);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        mySessionContext.delSession(session);
    }
}
