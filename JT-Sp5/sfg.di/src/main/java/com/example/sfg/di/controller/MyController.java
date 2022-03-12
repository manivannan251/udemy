package com.example.sfg.di.controller;

import org.springframework.stereotype.Controller;

import com.example.sfg.di.service.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
