package com.example.BookJPA.giohang;

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


@RestController
@CrossOrigin
public class GioHangController {
	@Autowired
	GioHangService giohangSer;
	
	@GetMapping("giohang/{login_tk}")
	public ResponseEntity< List<GioHang>> findGioHang(@PathVariable String login_tk) {
		return new ResponseEntity<List<GioHang>>(giohangSer.findGioHang(login_tk), HttpStatus.OK);
	}
	
	@PostMapping("/addgiohang")
	public ResponseEntity<GioHang> addGioHang(@RequestBody GioHang giohang){
		return new ResponseEntity<GioHang>(giohangSer.addGioHang(giohang),HttpStatus.CREATED);
	}
	
	@GetMapping("/deletegiohang/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id) {
		giohangSer.deleteGioHang(id);
		return new ResponseEntity<String>("Delete Sucessfully", HttpStatus.OK);
	}
}
