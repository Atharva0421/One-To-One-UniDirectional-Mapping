package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Book;
import com.service.*;

@RestController
public class Controller {
	
	@Autowired
	private Service service;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return this.service.getAllBooks();
	}
	
	@GetMapping("/byId/{id}")
	public Book getBookById(@PathVariable("id")int id) {
		return service.getBookById(id);
	}
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book b) {
		Book b1=this.service.AddNewBook(b);
		return b1;
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public void deleteById(@PathVariable("id")int id) {
		service.DeleteById(id);
		System.out.println("Deleted");
	}
	
	@PutMapping("/updateById/{id}")
	public Book updateById(@RequestBody Book b,@PathVariable("id")int id) {
		return service.updateById(b, id);
	}

}
