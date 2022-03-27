package com.wrk.shopsystem.base.service;

public interface LoginService {
    Boolean doLogin(String account,String passwd) throws Exception;
}
