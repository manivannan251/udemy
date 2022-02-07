package com.example.msscbrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.msscbrewery.web.model.CustomerDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDTO getCustomerbyId(UUID id) {
		
		return CustomerDTO.builder().id(UUID.randomUUID()).name("JT").build();
	}

	@Override
	public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
		return CustomerDTO.builder().id(customerDTO.getId()).build();
	}

	@Override
	public void handleUpdate(CustomerDTO customerDTO) {
		log.info("handling update code");
		
	}

	@Override
	public void deleteCustomer(UUID id) {
		log.info("Deleting the customer");
		
	}

}
