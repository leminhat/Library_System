package com.example.BookJPA.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@Controller

public class LoginController {

	@Autowired
	LoginService loginSer;
	
	@PostMapping("/editlogin/0")
	public ResponseEntity<Login> createLogin(@RequestBody Login login){
		return new ResponseEntity<Login>(loginSer.createLogin(login),HttpStatus.CREATED);
	}
	
	@GetMapping("/logins")
	public ResponseEntity<List<Login>> getAllLogin() {
		return new ResponseEntity<List<Login>>(loginSer.getAllLogin(), HttpStatus.OK);
	}
	
	@GetMapping("/login/{id}")
	public ResponseEntity<Login> getLoginById(@PathVariable int id) {
		return new ResponseEntity<Login>(loginSer.getLoginById(id), HttpStatus.OK);
	}
	
	@GetMapping("/deletelogin/{id}")
	public ResponseEntity<String> deleteLogin(@PathVariable int id) {

		loginSer.deleteLogin(id);
		return new ResponseEntity<String>("Delete Sucessfully", HttpStatus.OK);
	}
	
	@PostMapping("/updatelogin/{id}")
	public ResponseEntity<Login> updateLogin(@PathVariable int id, @RequestBody Login login){
		return new ResponseEntity<Login>(loginSer.updateLogin(id, login),HttpStatus.OK);
	}
	
	@PostMapping("/dangnhap")
	public ResponseEntity<Login> dangNhap(@RequestBody Login login){
		return new ResponseEntity<Login>(loginSer.dangNhap(login),HttpStatus.CREATED);
	}
	
}
