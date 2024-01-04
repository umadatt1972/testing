package com.example.demo4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String checkDisplay() {
		return "<h3>"+"Display is working in Demo Controller"+"</h3>";
		
	}

}
