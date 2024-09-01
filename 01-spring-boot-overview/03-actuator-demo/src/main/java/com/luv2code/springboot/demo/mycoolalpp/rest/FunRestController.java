package com.luv2code.springboot.demo.mycoolalpp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//expose "/" that return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	@GetMapping("/fortune")
	public String getFortune() {
		return "today is your lucky day";
	}
}