package com.zensar.sampleappweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Welcome TO Jenkins.</h1>";
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "<h1>Hi User</h1>";
	}
	
	@RequestMapping("/Bye")
	public String sayBye() {
		return "<h1>Good Bye/h1>";
	}
	
	@RequestMapping("/greet")
	public String greet() {
		return "<h1>Good Morning user/h1>";
	}
}
