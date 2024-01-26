package com.example.BookJPA.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookJPA.book.Book;

@CrossOrigin
@RestController
public class CommentController {
	
	@Autowired
	private CommentService comSer;
	
	@GetMapping("comment/{id}")
	public ResponseEntity< List<Comment>> getAllBook(@PathVariable int id) {
		return new ResponseEntity<List<Comment>>(comSer.findComment(id), HttpStatus.OK);
	}
	
	@PostMapping("/addcmt")
	public ResponseEntity<Comment> addCmt(@RequestBody Comment comment){
		return new ResponseEntity<Comment>(comSer.addCmt(comment),HttpStatus.CREATED);
	}
	
	@GetMapping("/deletecmt/{id}")
	public ResponseEntity<String> deleteCmt(@PathVariable int id) {
		comSer.deleteCmt(id);
		return new ResponseEntity<String>("Delete Sucessfully", HttpStatus.OK);
	}
	
	@GetMapping("/avg")
	public Double getAverageFieldValue() {
		return comSer.getAverageFieldValue();
	}
}
