package com.luv2code.springboot.demo.mycoolalpp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//Injecting properties from application.properties
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//new endpoint for team and coach info
	@GetMapping("/teaminfo")
	 public String getInfo() {
		return "Coach: "+coachName+"  Team: "+teamName;
		
	}
	
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