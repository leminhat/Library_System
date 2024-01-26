package com.example.BookJPA.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BookJPA.Login.Login;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
	@Query("select l From Book l Where l.tieude = ?1 and l.tacgia = ?2 ")
	public Book findBook(String tieude, String tacgia);
}
