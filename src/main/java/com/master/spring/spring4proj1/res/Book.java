package com.master.spring.spring4proj1.res;

public class Book {

	private static long COUNT = 0;

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
		return new Book(COUNT, "Sowah fe donya Allah " + COUNT++, Author.getInstance());
	}
}
