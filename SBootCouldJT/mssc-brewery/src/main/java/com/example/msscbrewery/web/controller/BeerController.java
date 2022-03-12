package com.example.msscbrewery.web.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.msscbrewery.service.BeerService;
import com.example.msscbrewery.web.model.BeerDTO;

@RequestMapping("app/v1/beer")
@RestController
public class BeerController {
	
	private final BeerService beerService;
	
	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId) {
		System.out.println("Inside beer controller");
		
		return new ResponseEntity<BeerDTO>(beerService.getBeerById(beerId), HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity saveBeer(@Valid @RequestBody BeerDTO beer) {
		BeerDTO beerDTO = beerService.save(beer);
		
		HttpHeaders header = new HttpHeaders();
		header.add("location", "app/v1/beer/"+beerDTO.getId());
		
		return new ResponseEntity(header, HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDTO beer) {
		beerService.update(beer);
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{beerId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable ("beerId") UUID beerId) {
		beerService.deletebyId(beerId);
	}
	
	
	
	@GetMapping("/test")
	public String test() {
		return "working";
	}
}
