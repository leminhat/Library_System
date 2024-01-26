package com.example.BookJPA.book;

import java.sql.Date;



import org.springframework.format.annotation.DateTimeFormat;

import io.micrometer.common.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookbtl")
public class Book{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String tieude;
	
	@NonNull
	private String tacgia;
	
	private String mota;
	
	@DateTimeFormat
	private Date ngayph;
	
	private int sotrang;
	
	private String theloai;
	
	
	
	private String linkimg;
	
	private int daban;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String tieude, String tacgia, String mota, Date ngayph, int sotrang, String theloai,
			String linkimg, int daban) {
		super();
		this.id = id;
		this.tieude = tieude;
		this.tacgia = tacgia;
		this.mota = mota;
		this.ngayph = ngayph;
		this.sotrang = sotrang;
		this.theloai = theloai;
		this.linkimg = linkimg;
		this.daban = daban;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Date getNgayph() {
		return ngayph;
	}

	public void setNgayph(Date ngayph) {
		this.ngayph = ngayph;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public String getLinkimg() {
		return linkimg;
	}

	public void setLinkimg(String linkimg) {
		this.linkimg = linkimg;
	}

	public int getDaban() {
		return daban;
	}

	public void setDaban(int daban) {
		this.daban = daban;
	}
	
	

	
	
	
}