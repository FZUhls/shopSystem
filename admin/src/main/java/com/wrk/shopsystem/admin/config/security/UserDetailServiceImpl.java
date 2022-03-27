package com.wrk.shopsystem.admin.config.security;

import com.wrk.shopsystem.base.mapper.RolesMapper;
import com.wrk.shopsystem.base.mapper.UserMapper;
import com.wrk.shopsystem.base.model.Roles;
import com.wrk.shopsystem.base.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

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
