package com.example.msscbrewery.service.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.msscbrewery.web.model.v2.BeerDTOV2;

@Service
public class BeerServiceImpleV2 implements BeerServiceV2 {

	@Override
	public BeerDTOV2 getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BeerDTOV2 beer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletebyId(UUID beerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public BeerDTOV2 save(BeerDTOV2 beer) {
		// TODO Auto-generated method stub
		return null;
	}

}
