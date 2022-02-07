package com.example.msscbrewery.service;

import java.util.UUID;

import com.example.msscbrewery.web.model.CustomerDTO;

public interface CustomerService {

		public CustomerDTO getCustomerbyId(UUID id);

		public CustomerDTO saveCustomer(CustomerDTO customerDTO);

		public void handleUpdate(CustomerDTO customerDTO);

		public void deleteCustomer(UUID id);
}
