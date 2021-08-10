package com.zxy.shopsystem.base.service;

public interface LoginService {
    Boolean doLogin(String account,String passwd) throws Exception;
}
