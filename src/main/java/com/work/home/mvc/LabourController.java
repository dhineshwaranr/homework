package com.work.home.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("hasRole('ROLE_LABOUR')")
@RequestMapping("/labour")
@RestController
public class LabourController {

	@RequestMapping(value="/labour-only",method = RequestMethod.GET)
    public ResponseEntity<?> getProtectedGreetingtwo() {
		return ResponseEntity.ok("Greetings from Labour method!");
    }
	
}
