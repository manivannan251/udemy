package guru.springframework.msscbreweryclient.web.client;

import java.net.URI;
import java.util.UUID;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;

@Component
@ConfigurationProperties("sfg.brewery.customer")
public class CustomerClient {
	
	
	private String apiHost;
	
	private final String BEER_PATH_V1 = "api/v1/customer/";
	
	
	private RestTemplate restTemplate;
	
	
	public CustomerClient(RestTemplateBuilder restTemplateBuilder) {
		restTemplate = restTemplateBuilder.build();
	}
	
	
	public CustomerDto getCustomer(UUID id) {
		return restTemplate.getForObject(apiHost+"/"+BEER_PATH_V1+id.toString(), CustomerDto.class);
	}
	
	
	public URI saveCustomer(CustomerDto customer) {
		return restTemplate.postForLocation(apiHost+"/"+BEER_PATH_V1, customer);
	}
	
	
	public void updateCustomer(UUID id,CustomerDto customer) {
		restTemplate.put(apiHost+BEER_PATH_V1+id.toString(), customer);
	}
	
	
	
	public void deleteCustomer(UUID id) {
		restTemplate.delete(apiHost+BEER_PATH_V1+id.toString());
	}
	
	

	public void setApiHost(String apiHost) {
		this.apiHost = apiHost;
	}
	
	
}
