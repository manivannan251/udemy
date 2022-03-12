package com.example.sfg.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfg.di.service.ConstructorGreetingService;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(setterInjectedController.getGreeting());
	}

}
