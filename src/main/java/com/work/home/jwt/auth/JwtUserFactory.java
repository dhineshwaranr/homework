package com.work.home.jwt.auth;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.work.home.entity.Authority;
import com.work.home.entity.User;

public class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
    	return new JwtUser(
                user.getId(),
                user.getUserName(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getAuthorities()),
                user.isEnabled(),
                user.getLastPasswordResetDate()
        );
        
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
    	return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
                .collect(Collectors.toList());
    }
}
