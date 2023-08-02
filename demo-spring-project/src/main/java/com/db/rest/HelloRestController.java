package com.db.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */

@RestController
public class HelloRestController {
	
	
	//Fetch or Get the details
	@GetMapping("/myservice")
	public String getEmployee() {
		return "I am the employee with Id 101 + first micro service";
	}
	
	
}