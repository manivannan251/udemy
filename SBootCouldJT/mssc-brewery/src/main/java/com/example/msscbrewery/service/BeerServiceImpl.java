package com.example.msscbrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.msscbrewery.web.model.BeerDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		return BeerDTO.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat").beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDTO save(BeerDTO beer) {
		return BeerDTO.builder().id(beer.getId()).build();
	}

	@Override
	public void update(BeerDTO beer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletebyId(UUID beerId) {
		log.info("Deleteing the beer");
		
	}

}
