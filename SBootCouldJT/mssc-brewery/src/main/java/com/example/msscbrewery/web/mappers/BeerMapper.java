package com.example.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import com.example.msscbrewery.domain.Beer;
import com.example.msscbrewery.web.model.BeerDTO;

@Mapper(uses= {DateMapper.class})
public interface BeerMapper {
	
	BeerDTO beerToBeerDTO(Beer beer);
	
	Beer beerDTOToBeer(BeerDTO dto);
}
