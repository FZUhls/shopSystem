package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.model.User;
import com.zxy.shopsystem.mapper.UserMapper;
import com.zxy.shopsystem.service.LoginService;
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
