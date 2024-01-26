package com.example.BookJPA.giohang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookJPA.book.Book;

@Service
public class GioHangService {
	@Autowired
	GioHangRepository giohangRepo;
	
	public List<GioHang> findGioHang(String login_tk){
		return giohangRepo.findGioHang(login_tk);
	}
	
	public GioHang addGioHang(GioHang giohang) {
		GioHang oldgiohang = giohangRepo.findoneGioHang( giohang.getBook_id(), giohang.getLogin_tk() );
		if(oldgiohang!=null) {
			giohang.setSoluong(giohang.getSoluong()+oldgiohang.getSoluong());
			giohang.setId(oldgiohang.getId());
		return giohangRepo.save(giohang);
		}
		return giohangRepo.save(giohang);
	};
	
	public void deleteGioHang(int id) {
		GioHang giohang = giohangRepo.findById(id).get();
		if(giohang != null) {
			giohangRepo.delete(giohang);
		}
		
	};
	
}
