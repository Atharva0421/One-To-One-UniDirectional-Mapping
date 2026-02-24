package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.BookRepository;
import com.entity.Book;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired 
	private BookRepository bookRepo;
	
	public List<Book> getAllBooks(){
		List<Book>list=(List<Book>)this.bookRepo.findAll();
		return list;
	}
	
	public Book getBookById(int id) {
		return this.bookRepo.findById(id).orElse(null);
	}
	
	public Book AddNewBook(Book b) {
		Book result=bookRepo.save(b);
		return result;
	}
	
	public void DeleteById(int id) {
		bookRepo.deleteById(id);
	}
	
	public Book updateById(Book b,int id) {
		Book k=bookRepo.findById(id).orElse(null);
		
		if(k==null) {
			return null;
		}
		else {
			k.setBook_name(b.getBook_name());;
			k.setAuthor(b.getAuthor());
		}
		return bookRepo.save(k);
	}
	
	

}
