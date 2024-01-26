package com.example.BookJPA.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.BookJPA.Login.Login;
import com.example.BookJPA.giohang.GioHang;




@CrossOrigin
@RestController

public class BookController {
	@Autowired
	BookService bookSer;
	
	@PostMapping("/editbook/0")
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookSer.createBook(book),HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBook() {
		return new ResponseEntity<List<Book>>(bookSer.getAllBook(), HttpStatus.OK);
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id) {
		return new ResponseEntity<Book>(bookSer.getBookById(id), HttpStatus.OK);
	}
	
	@GetMapping("/deletebook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id) {
		bookSer.deleteBook(id);
		return new ResponseEntity<String>("Delete Sucessfully", HttpStatus.OK);
	}
	
	@PostMapping("/updatebook/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book){
		return new ResponseEntity<Book>(bookSer.updateBook(id, book),HttpStatus.OK);
	}
	
	@PostMapping("/addgiohang2")
	public ResponseEntity<Book> addGioHang(@RequestBody GioHang giohang){
		return new ResponseEntity<Book>(bookSer.addGioHang(giohang),HttpStatus.CREATED);
	}

	
	
	
}
