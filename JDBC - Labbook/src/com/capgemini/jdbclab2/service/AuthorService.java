package com.capgemini.jdbclab2.service;

import java.util.List;

import com.capgemini.jdbclab2.entities.Author;

public interface AuthorService {
	public String insertAuthor(Author a);
	public String updateAuthor(String a,double price);
	public String deleteAuthor(String authorId);
	public Author findAuthor(String authorId);
	public List<String> displayAuthorId();
}
