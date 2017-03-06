package com.work.home.mvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.home.entity.User;
import com.work.home.helpers.StringManipulationHelpers;
import com.work.home.jwt.auth.JwtTokenUtil;
import com.work.home.jwt.auth.JwtUser;
import com.work.home.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private StringManipulationHelpers stringHelpers;
    
    @Autowired
    private UserDetailsService userDetailsService;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
    	String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        String[] roles = stringHelpers.listUserAuthorities(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        System.out.println("user :"+ user.getFirstname());
        return user;
    }
	
    @RequestMapping(value="/user",method=RequestMethod.POST)
	public User addUser(@ModelAttribute User user){
		User savedUser = userService.addUser(user);
		return savedUser;
	}
	
	/*@RequestMapping(value="/user",method=RequestMethod.GET)
	@ResponseBody
	public List<UserEntity> findAllUser(){
		List<UserEntity> users = userService.findAllUsers();
		return users;
	}*/
	
	@RequestMapping(value="/user/{userId}",method=RequestMethod.PUT)
	@ResponseBody
	public User updateUser(@RequestParam(value="role") List<Integer> role, @PathVariable(value="userId") String userId){
		System.out.println(role);
		//UserEntity savedUser = userService.updateUser(roles, userId);
		return null;
	}
	
}
