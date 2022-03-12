package com.example.sdjpaintro;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sdjpaintro.repository.BookRepository;

@SpringBootTest
class SdjpaIntroApplicationTests {
	
	@Autowired
	BookRepository bookRepository;

	@Test
	void testRepository() {
		long count = bookRepository.count();
		assertThat(count).isGreaterThan(0);
	}

}
