package com.example.BookJPA.comment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BookJPA.book.Book;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
	@Query("select l From Comment l Where l.book_id = ?1 ")
	public List<Comment> findComment(int book_id);
	
	@Query("SELECT AVG(e.star) FROM Comment e")
    Double getAverageFieldValue();
}
