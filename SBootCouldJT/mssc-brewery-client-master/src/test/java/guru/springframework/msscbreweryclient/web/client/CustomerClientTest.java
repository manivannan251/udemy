package guru.springframework.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ResponseStatus;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;

@SpringBootTest
class CustomerClientTest {
	
	@Autowired
	CustomerClient customerClient;
	
	@Test
	void testGetCustomer() {
		CustomerDto customer = customerClient.getCustomer(UUID.randomUUID());
		assertNotNull(customer);
	}
	
	
	@Test
	void testsaveCustomer() {
		
		UUID id = UUID.randomUUID();
		CustomerDto dto = CustomerDto.builder().name("Soan").id(id).build();
				
		URI uri =		customerClient.saveCustomer(dto);
		System.out.println(id);
		assertNotNull(uri);
		System.out.println(uri.toString());
	}
	
	
	@Test
	void testUpdateBeer() {
		UUID id = UUID.randomUUID();
		CustomerDto dto = CustomerDto.builder().name("Soan").id(id).build();
		customerClient.updateCustomer(id, dto);
	}
	
	
	@Test	
	void deleteBeer() {
		customerClient.deleteCustomer(UUID.randomUUID());
	}

}
