package com.master.spring.spring4proj1.res;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private static long COUNT = 0;
	private static List<Book> booksPool = new ArrayList<>();

	private long id;
	private String name;
	private Author author;

	private Book() {
		super();
	}

	public Book(long id, String name, Author author) {
		this();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author.toString() + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public static Book getInstance() {
		Book book = new Book(COUNT, "Sowah fe donya Allah " + COUNT++, Author.getInstance());
		booksPool.add(book);
		return book;
	}

	public static Book getInstance(int id) {
		for (Book book : booksPool) {
			if (id == book.getId()) {
				return book;
			}
		}
		Book book = new Book(id, "Sowah fe donya Allah " + id, Author.getInstance(id));
		booksPool.add(book);
		return book;
	}
}
