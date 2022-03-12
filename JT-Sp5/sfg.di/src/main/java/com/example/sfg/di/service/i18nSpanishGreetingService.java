package com.example.sfg.di.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service
@Qualifier("i18nService")
public class i18nSpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola - Munda - ES";
	}

}
