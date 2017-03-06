package com.work.home.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.work.home.entity.Authority;
import com.work.home.entity.User;
import com.work.home.service.RoleService;

@RestController
@RequestMapping(value = "/superadmin")
public class RolesController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/role",method=RequestMethod.POST)
	public Authority addRole(@ModelAttribute Authority role){
		Authority savedRole = roleService.addRole(role);
		return savedRole;
	}
	
	@RequestMapping(value="/role",method=RequestMethod.GET)
	public List<Authority> getAllRoles(){
		
		return null;
	}
	/*@RequestMapping(value="/role/{roleId}",method=RequestMethod.PUT)
	public String editRole(@ModelAttribute Authority role, @PathVariable int roleId){
		System.out.println(role.getRoleName());
		return null;
	}*/
	@RequestMapping(value="/role/{roleId}",method=RequestMethod.DELETE)
	public String deleteRole(@PathVariable int roleId){
		System.out.println(roleId);
		return null;
	}
}
