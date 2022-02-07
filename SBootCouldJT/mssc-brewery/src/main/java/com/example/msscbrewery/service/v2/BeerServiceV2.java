package com.example.msscbrewery.service.v2;

import java.util.UUID;

import com.example.msscbrewery.web.model.BeerDTO;
import com.example.msscbrewery.web.model.v2.BeerDTOV2;

public interface BeerServiceV2 {

	BeerDTOV2 getBeerById(UUID beerId);

	void update(BeerDTOV2 beer);

	void deletebyId(UUID beerId);

	BeerDTOV2 save(BeerDTOV2 beer);

}
