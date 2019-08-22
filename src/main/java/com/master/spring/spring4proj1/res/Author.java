package com.master.spring.spring4proj1.res;

public class Author {

	private static long COUNT = 0;

	private long id;
	private String name;

	private Author() {
		super();
	}

	public Author(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}

	public static Author getInstance() {
		return new Author(COUNT, "Mostafa Mahmoud " + COUNT++);
	}
}
