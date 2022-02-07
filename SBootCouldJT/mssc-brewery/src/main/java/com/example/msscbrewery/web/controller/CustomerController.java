package com.example.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.msscbrewery.service.CustomerService;
import com.example.msscbrewery.web.model.CustomerDTO;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{custId}")
	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("custId") UUID id) {
		return new ResponseEntity<CustomerDTO>(customerService.getCustomerbyId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity saveBeer(@RequestBody CustomerDTO customerDTO) {
		CustomerDTO customer = customerService.saveCustomer(customerDTO);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("location", "api/v1/customer"+customer.getId());
		
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@PutMapping("/{custId}")
	public ResponseEntity handleUpdate(@PathVariable("custId") UUID id,@RequestBody CustomerDTO customerDTO) {
		customerService.handleUpdate(customerDTO);
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{custId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable("custId") UUID id) {
		customerService.deleteCustomer(id);
	}
	
	
}
