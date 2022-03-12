package guru.springframework.msscbreweryclient.web.client;

import java.net.URI;
import java.util.UUID;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import guru.springframework.msscbreweryclient.web.model.BeerDto;

@Component
@ConfigurationProperties("sfg.brewery")
public class BreweryClient {
	
	public final String BEER_PATH_V1= "/app/v1/beer/";
	
	private String apihost;
	
	private final RestTemplate restTemplate;
	
	public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public BeerDto getBeerbyId(UUID id) {
		return restTemplate.getForObject(apihost+BEER_PATH_V1+id.toString(), BeerDto.class);
	}
	
	
	public URI saveBeer(BeerDto beerDTO) {
		return restTemplate.postForLocation(apihost+BEER_PATH_V1, beerDTO);
	}
	
	
	public void updateBeer(UUID id,BeerDto beerDTO) {
		restTemplate.put(apihost+BEER_PATH_V1+id.toString(), beerDTO);
	}
	
	
	
	public void deleteBeer(UUID id) {
		restTemplate.delete(apihost+BEER_PATH_V1+id.toString());
	}

	public void setApihost(String apihost) {
		this.apihost = apihost;
	}
	
	
}
