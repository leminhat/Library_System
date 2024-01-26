package com.example.BookJPA.giohang;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="giohang")
public class GioHang {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private int book_id;
	
	@NonNull
	private String login_tk;
	
	@NonNull
	private String tieude;
	
	@NonNull
	private String tacgia;
	
	@NonNull 
	private String linkimg;
	
	private int soluong;

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public GioHang(int id, int book_id, String login_tk, String tieude, String tacgia, String linkimg, int soluong) {
		super();
		this.id = id;
		this.book_id = book_id;
		this.login_tk = login_tk;
		this.tieude = tieude;
		this.tacgia = tacgia;
		this.linkimg = linkimg;
		this.soluong = soluong;
	}

	public GioHang() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public String getLinkimg() {
		return linkimg;
	}

	public void setLinkimg(String linkimg) {
		this.linkimg = linkimg;
	}
	
	
	
	
}
