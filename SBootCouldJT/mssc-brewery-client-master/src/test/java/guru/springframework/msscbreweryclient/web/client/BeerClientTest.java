package guru.springframework.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	
	
	@Test
	void testsaveBeer() {
		
		UUID id = UUID.randomUUID();
		BeerDto dto = BeerDto.builder().beerName("New Beer").id(null).beerName("Galaxy Cat")
				.beerStyle("Pale Ale").build();
				
		URI uri =		breweryClient.saveBeer(dto);
		System.out.println(id);
		assertNotNull(uri);
		System.out.println(uri.toString());
	}
	
	
	@Test
	void testUpdateBeer() {
		UUID id = UUID.randomUUID();
		BeerDto dto = BeerDto.builder().id(null).beerName("Galaxy Cat")
				.beerStyle("Ale")
				.build();
		breweryClient.updateBeer(id, dto);
	}
	
	
	@Test
	@ResponseStatus()
	void deleteBeer() {
		breweryClient.deleteBeer(UUID.randomUUID());
	}

}
