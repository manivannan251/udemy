package com.example.sdjpaintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.sdjpaintro.domain.Book;
import com.example.sdjpaintro.repository.BookRepository;

@Profile({"local","default"})
@Component
public class DataInitializer implements CommandLineRunner {
	
	private BookRepository bookRepository;
	
	public DataInitializer(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.deleteAll();
		Book bDDD = new Book("Behaviour Driven Design", "1234", "Opa");
		
		System.out.println(bDDD.getId());
		
		Book savedbDD = bookRepository.save(bDDD);
		
		System.out.println(savedbDD.getId());
		
		Book spa = new Book("Spring in Action", "4444", "Oreilly");
		
		Book savedspa = bookRepository.save(spa);
		
		System.out.println(savedspa.getId());
		
		
		bookRepository.findAll().forEach(book -> {
			System.out.println("The id is "+book.getId());
			System.out.println("The book name is "+book.getTitle());
		});
		
	}
}
