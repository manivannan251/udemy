package com.example.sfg.di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfg.di.service.GreetingService;

@Controller
public class i18nController {
	
	private final GreetingService greetingService;

	public i18nController(@Qualifier("i18nService") GreetingService greetingService) {		
		this.greetingService = greetingService;
	}
	
	
	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
	
	
}
