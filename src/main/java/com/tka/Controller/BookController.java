package com.tka.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.Book;
import com.tka.Service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookservice;

	@GetMapping("hello")
	public static String hello() {
		return "hello hii welcome";
	}
	@GetMapping("fetchallbooks")
	public static ArrayList<Book>fetchAllBooks(){
		ArrayList<Book>books=new ArrayList<Book>();
		for(Book:books) {
			
		}
		return books;
	}

	
	
//GET /api/books/{id} 
	/*
	 * @GetMapping("getbookdetailsperId")
	 * 
	 * public static List<Book> getbookdetailsperId() { List<Book>book=new
	 * ArrayList<Book>(); return book; }
	 */

}
