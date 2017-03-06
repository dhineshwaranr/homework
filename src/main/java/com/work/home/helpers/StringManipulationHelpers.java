package com.work.home.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.home.jwt.auth.JwtTokenUtil;

@Service
public class StringManipulationHelpers {

	@Autowired
    private JwtTokenUtil jwtTokenUtil;
	
	public String[] listUserAuthorities(String token){
    	String role = jwtTokenUtil.getAuthoritiesFromToken(token);
    	String temp = role.replaceAll("authority=", "");
    	temp = temp.replaceAll("[\\[\\](){}]","");
    	//b = b.replaceAll("\\{","");
    	String[] roles = temp.split(",");
        return roles;
    }
	
}
