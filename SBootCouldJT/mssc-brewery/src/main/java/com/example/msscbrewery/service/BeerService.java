package com.example.msscbrewery.service;

import java.util.UUID;

import com.example.msscbrewery.web.model.BeerDTO;

public interface BeerService {
	
	public BeerDTO getBeerById(UUID beerId);

	public BeerDTO save(BeerDTO beer);

	public void update(BeerDTO beer);

	public void deletebyId(UUID beerId);
}
