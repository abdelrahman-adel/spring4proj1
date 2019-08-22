package com.master.spring.spring4proj1.res;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		logger.info("in getAllBooks()");
		List<Book> books = getFakeBooks(1);
		return books;
	}

	private List<Book> getFakeBooks(int count) {
		logger.info("in getFakeBooks({})", count);
		List<Book> books = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			books.add(new Book(i, "Sowah fe donya Allah " + i, "Mostafa Mahmoud " + i));
		}
		return books;
	}

}
