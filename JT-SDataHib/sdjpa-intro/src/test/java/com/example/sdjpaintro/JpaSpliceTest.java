package com.example.sdjpaintro;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Commit;

import com.example.sdjpaintro.domain.Book;
import com.example.sdjpaintro.repository.BookRepository;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
@ComponentScan(basePackages = {"com.example.sdjpaintro.bootstrap"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class JpaSpliceTest {

	@Autowired
	BookRepository bookRepository;

	@Order(1)
	@Test
	@Commit
	void testJpaSliceMethod() {
		long countBefore = bookRepository.count();

		assertThat(countBefore).isEqualTo(2);

		bookRepository.save(new Book("FRT", "345678", "self"));

		long countAfter = bookRepository.count();

		assertThat(countBefore).isLessThan(countAfter);

	}

	@Order(2)
	@Test
	void testJpaTestSpliceTransaction() {
		long countBefore = bookRepository.count();
		assertThat(countBefore).isEqualTo(3);

	}

}
