package com.example.BookJPA.giohang;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BookJPA.book.Book;



@Repository
public interface GioHangRepository extends JpaRepository<GioHang, Integer> {
	@Query("select l From GioHang l Where l.login_tk = ?1 ")
	public List<GioHang> findGioHang(String login_tk);
	
	@Query("select l From GioHang l Where l.book_id = ?1 and l.login_tk = ?2 ")
	public GioHang findoneGioHang(int book_id, String login_tk);
}
