package com.master.spring.spring4proj1.res;

import java.util.ArrayList;
import java.util.List;

public class Author {

	private static long COUNT = 0;
	private static List<Author> authorsPool = new ArrayList<>();

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
		Author author = new Author(COUNT, "Mostafa Mahmoud " + COUNT++);
		authorsPool.add(author);
		return author;
	}

	public static Author getInstance(int id) {
		for (Author author : authorsPool) {
			if (id == author.getId()) {
				return author;
			}
		}
		Author author = new Author(id, "Mostafa Mahmoud " + id);
		authorsPool.add(author);
		return author;
	}
}
