package com.example.msscbrewery.web.controller.v2;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.msscbrewery.service.BeerService;
import com.example.msscbrewery.service.v2.BeerServiceV2;
import com.example.msscbrewery.web.model.BeerDTO;
import com.example.msscbrewery.web.model.v2.BeerDTOV2;

@RequestMapping("app/v2/beer")
@RestController
public class BeerControllerV2 {
	
	private final BeerServiceV2 beerServiceV2;
	
	public BeerControllerV2(BeerServiceV2 beerServiceV2) {
		this.beerServiceV2 = beerServiceV2;
	}
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTOV2> getBeer(@PathVariable("beerId") UUID beerId) {
		System.out.println("Inside beer controller");
		
		return new ResponseEntity<BeerDTOV2>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity saveBeer(@RequestBody BeerDTOV2 beer) {
		BeerDTOV2 beerDTO = beerServiceV2.save(beer);
		
		HttpHeaders header = new HttpHeaders();
		header.add("location", "app/v1/beer/"+beerDTO.getId());
		
		return new ResponseEntity(header, HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,BeerDTOV2 beer) {
		beerServiceV2.update(beer);
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{beerId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable ("beerId") UUID beerId) {
		beerServiceV2.deletebyId(beerId);
	}
}
