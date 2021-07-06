package com.zxy.shopsystem.service;

public interface LoginService {
    Boolean doLogin(String account,String passwd) throws Exception;
}
