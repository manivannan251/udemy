package com.example.demo.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Beer;
import com.example.demo.repositories.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner {
	
	private final BeerRepository beerRepository;
	
	public BeerLoader(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		loadBeerObjects();
		
	}

	private void loadBeerObjects() {
		
		if(beerRepository.count()==0) {
			beerRepository.save(Beer.builder().beerName("Mango Bobs")
					.beerStyle("IPA")
					.quantityToBrew(200)
					.minOnHand(12)
					.upc(3333333338383838L)
					.price(new BigDecimal("12.95"))
					.build());
			
			
			beerRepository.save(Beer.builder().beerName("Galaxy Cat")
					.beerStyle("Pale Ale")
					.quantityToBrew(200)
					.minOnHand(12)
					.upc(3333333338383839L)
					.price(new BigDecimal("11.95"))
					.build());
		}
		
	}

}
