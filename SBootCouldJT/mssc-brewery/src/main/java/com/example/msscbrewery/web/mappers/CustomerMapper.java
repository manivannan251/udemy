package com.example.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import com.example.msscbrewery.domain.Customer;
import com.example.msscbrewery.web.model.CustomerDTO;

@Mapper
public interface CustomerMapper {
	
	CustomerDTO customerToCustomerDTO(Customer customer);
	
	Customer customerDTOToCustomer(CustomerDTO dto);
}
