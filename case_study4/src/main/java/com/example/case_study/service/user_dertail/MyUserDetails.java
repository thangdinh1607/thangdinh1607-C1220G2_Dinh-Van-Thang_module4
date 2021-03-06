//package com.example.case_study.service.user_dertail;
//
//import com.example.case_study.model.Role;
//import com.example.case_study.model.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.Set;
//
//
//public class MyUserDetails implements UserDetails {
//    private User user;
//    public MyUserDetails(User user) {
//        this.user = user;
//    }
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        Set<Role> roles = user.getRoles();
//
//        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
//        for (Role r : roles) {
//            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(r.getName()));
//        }
//        return simpleGrantedAuthorities;
//    }
//
//    @Override
//    public String getPassword() {
//
//        return user.getPassword();
//    }
//    @Override
//    public String getUsername() {
//        return user.getUser();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//
//
//}
//
