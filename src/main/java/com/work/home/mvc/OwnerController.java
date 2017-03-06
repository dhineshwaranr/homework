package com.work.home.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
@PreAuthorize("hasRole('ROLE_OWNER')")
public class OwnerController {

	@RequestMapping(value="/owner-only",method = RequestMethod.GET)
    public ResponseEntity<?> getProtectedGreetingOne() {
		return ResponseEntity.ok("Greetings from owner protected method!");
    }
	
}
