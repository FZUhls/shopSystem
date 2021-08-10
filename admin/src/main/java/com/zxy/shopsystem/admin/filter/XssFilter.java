package com.zxy.shopsystem.admin.filter;

import com.zxy.shopsystem.admin.requestWrapper.XssHttpServletRequestWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j

@Component
@WebFilter
@Order(1)
public class XssFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        log.warn("create filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doXssFilter,this request is "+request.getRemoteAddr());
        HttpServletRequest req = (HttpServletRequest) request;
        chain.doFilter(new XssHttpServletRequestWrapper(req),response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        log.warn("destroy filter");
    }
}
