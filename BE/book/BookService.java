package com.example.BookJPA.book;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.BookJPA.giohang.GioHang;



@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	
	public Book createBook(Book book) {
		Book oldbook = bookRepo.findBook( book.getTieude(), book.getTacgia());
		if(oldbook==null) {	
		return bookRepo.save(book);
		}
		return null;
	};
	
	public List <Book> getAllBook(){
		return bookRepo.findAll();
	};
	
	public Book getBookById (int id) {
		return bookRepo.findById(id).get();
	};
	
	public void deleteBook(int id) {
		Book book = bookRepo.findById(id).get();
		if(book != null) {
			bookRepo.delete(book);
		}
		
	};
	
	public Book updateBook(int id,Book book) {
		Book oldbook = bookRepo.findById(id).get();
		if(oldbook != null) {
			book.setId(id);
			return bookRepo.save(book);
		}
		return null;
	};
	
	public Book addGioHang(GioHang giohang) {
		Book oldbook = bookRepo.findById(giohang.getBook_id()).get();
		oldbook.setDaban(oldbook.getDaban()+giohang.getSoluong());	
		return bookRepo.save(oldbook);
		
		
	};
	
	
}


					