package com.example.msscbrewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import com.example.msscbrewery.web.model.v2.BeerDTOV2;
import com.example.msscbrewery.web.model.v2.BeerStyleEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
	
	private UUID id;
	
	private String beerName;
	
	private BeerStyleEnum beerStyle;
	
	private Long upc;
	
	private Timestamp createdDate;
	
	private Timestamp lastUpdatedDate;
}
