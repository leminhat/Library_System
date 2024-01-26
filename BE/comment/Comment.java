package com.example.BookJPA.comment;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private int book_id;
	@NonNull
	private String login_tk;
	
	private String cmt;
	private int star;
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(int id, int book_id, String login_tk, String cmt, int star) {
		super();
		this.id = id;
		this.book_id = book_id;
		this.login_tk = login_tk;
		this.cmt = cmt;
		this.star = star;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getLogin_tk() {
		return login_tk;
	}
	public void setLogin_tk(String login_tk) {
		this.login_tk = login_tk;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	
}
