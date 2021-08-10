package com.zxy.shopsystem.admin.config.security;

import com.zxy.shopsystem.base.model.Roles;
import com.zxy.shopsystem.base.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
public class UserDetail implements UserDetails {

    private User user;
    private Roles roles;


    private Collection<? extends GrantedAuthority> authorities;

    public UserDetail(User user,Roles roles){
        this.roles = roles;
        this.user = user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }
    @Override
    public String getPassword() {
        return user.getPassword();
    }
    @Override
    public String getUsername() {
        return user.getAccount();
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
