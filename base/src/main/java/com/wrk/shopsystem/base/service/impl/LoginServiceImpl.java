package com.wrk.shopsystem.base.service.impl;

import com.wrk.shopsystem.base.model.User;
import com.wrk.shopsystem.base.mapper.UserMapper;
import com.wrk.shopsystem.base.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Boolean doLogin(String account,String passwd) throws Exception {
        User user = userMapper.selectByPrimaryKey(account);
        if(user == null){
            throw new Exception("no this user");
        }else {
            if (user.getAccount().equals(passwd)){
                return true;
            }else {
                return false;
            }
        }
    }
}
