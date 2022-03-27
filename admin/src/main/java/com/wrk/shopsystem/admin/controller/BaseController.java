package com.wrk.shopsystem.admin.controller;


import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * controller 基础类
 *
 * @author Henry
 */
public abstract class BaseController {
    protected HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
    }

    protected String getSessionId() {
        return getRequest().getSession().getId();
    }

    protected HttpSession getSession() {
        return getRequest().getSession();
    }
}
