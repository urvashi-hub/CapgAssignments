package com.capgemini.jdbclab2.service;

import com.capgemini.jdbclab2.dao.AuthorDao;
import com.capgemini.jdbclab2.dao.AuthorDaoImpl;
import com.capgemini.jdbclab2.entities.Author;
import java.math.*;
import java.util.List;

public class AuthorServiceImpl implements AuthorService{
	AuthorDao dao=new AuthorDaoImpl();
	@Override
	public String insertAuthor(Author a) {
		Double num = Math.random();
		String id = a.getFirstName().substring(0, 3) + num.toString().substring(2, 6);
		a.setAuthorId(id);
		return dao.insertAuthor(a);
	}
	
	@Override
	public String updateAuthor(String a, double price) {
		return dao.updateAuthor(a, price);
		
	}

	@Override
	public String deleteAuthor(String authorId) {
		return dao.deleteAuthor(authorId);
	}

	@Override
	public Author findAuthor(String authorId) {
		return dao.findAuthor(authorId);
	}

	public List<String> displayAuthorId(){
		return dao.displayAuthorId();
	}
}
