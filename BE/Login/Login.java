package com.example.BookJPA.Login;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="login")
@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private String tk;
	
	@NonNull
	private String mk;
	
	private String name;
	private String quyen;
	private String giohang;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int id, String tk, String mk, String name, String quyen, String giohang) {
		super();
		this.id = id;
		this.tk = tk;
		this.mk = mk;
		this.name = name;
		this.quyen = quyen;
		this.giohang = giohang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTk() {
		return tk;
	}
	public void setTk(String tk) {
		this.tk = tk;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuyen() {
		return quyen;
	}
	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}
	public String getGiohang() {
		return giohang;
	}
	public void setGiohang(String giohang) {
		this.giohang = giohang;
	}
	
	
	
	
	
}
