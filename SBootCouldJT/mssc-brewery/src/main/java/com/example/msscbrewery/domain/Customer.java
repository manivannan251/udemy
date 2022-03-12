package com.example.msscbrewery.domain;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.msscbrewery.web.model.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
	
	private UUID id;
	
	@NotBlank
	@Size(min = 3,max = 100)
	private String name;
}
