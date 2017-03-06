package com.work.home.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("protected")
public class MethodProtectedRestController {

	@RequestMapping(value="/adminonly",method = RequestMethod.GET)
    public ResponseEntity<?> getProtectedGreeting() {
        return ResponseEntity.ok("Greetings from admin protected method!");
    }
	
	@RequestMapping(value="/useronly",method = RequestMethod.GET)
    public ResponseEntity<?> getProtectedGreetingOne() {
		return ResponseEntity.ok("Greetings from owner protected method!");
    }
	
	@RequestMapping(value="/superadminonly",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_SUPERADMIN')")
    public ResponseEntity<?> getProtectedGreetingtwo() {
		return ResponseEntity.ok("Greetings from super admin protected method!");
    }
	
}
