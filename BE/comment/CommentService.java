package com.example.BookJPA.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookJPA.book.Book;

@Service
public class CommentService {
	@Autowired
	private CommentRepository comRepo;
	
	public List <Comment> findComment(int id){
		return comRepo.findComment(id);
	}
	
	public Comment addCmt(Comment comment) {
		return comRepo.save(comment);
	}
	
	public void deleteCmt(int id) {
		Comment cmt = comRepo.findById(id).get();	
		if(cmt != null) {
			comRepo.delete(cmt);
		}		
	};
	
	 public Double getAverageFieldValue() {
	        return comRepo.getAverageFieldValue();
	    }
}
