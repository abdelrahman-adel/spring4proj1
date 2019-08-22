package com.master.spring.spring4proj1.res;

public class Book {

	private long id;
	private String name;
	private String author;

	private Book() {
		super();
	}

	public Book(long id, String name, String author) {
		this();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
}
