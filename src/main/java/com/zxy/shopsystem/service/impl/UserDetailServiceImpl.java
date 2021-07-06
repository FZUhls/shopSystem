package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.model.Roles;
import com.zxy.shopsystem.model.User;
import com.zxy.shopsystem.model.UserDetail;
import com.zxy.shopsystem.mapper.RolesMapper;
import com.zxy.shopsystem.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RolesMapper rolesMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;
        Roles roles = null;
        UserDetails userDetails = null;
        try {
            user = userMapper.selectByPrimaryKey(username);
            if (user!=null){
                roles = rolesMapper.selectByPrimaryKey(user.getRoleId());
                if(roles!=null){
                    userDetails = new UserDetail(user,roles);
                }
            }else {
                throw new UsernameNotFoundException("不存在该用户!");
            }
            return userDetails;
        }catch (Exception e){
            throw e;
        }
    }
}
