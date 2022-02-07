package guru.springframework.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.msscbreweryclient.web.model.BeerDto;

@SpringBootTest
class BeerClientTest {
	
	@Autowired
	BreweryClient breweryClient;

	@Test
	void testGetBeerbyId() {
		BeerDto dto = breweryClient.getBeerbyId(UUID.randomUUID());
		assertNotNull(dto);
	}

}
