package com.example.BookJPA.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepo;
	
	public Login createLogin(Login login) {
		Login oldlogin = loginRepo.findLogintk(login.getTk());
		if(oldlogin==null) {		
		return loginRepo.save(login);
		}
		return null;
	};
	
	public List <Login> getAllLogin(){
		return loginRepo.findAll();
	};
	
	public Login getLoginById (int id) {
		return loginRepo.findById(id).get();
	};
	
	public void deleteLogin(int id) {
		Login login = loginRepo.findById(id).get();
		if(login != null) {
			loginRepo.delete(login);
		}
		
	};
	
	public Login updateLogin(int id,Login login) {
		Login oldlogin = loginRepo.findById(id).get();
		if(oldlogin != null) {
			login.setId(id);
			return loginRepo.save(login);
		}
		return null;
	};
	
	public Login dangNhap(Login login) {
		Login oldlogin = loginRepo.findLogin(login.getTk(),login.getMk());
		if(oldlogin!=null) {		
		return oldlogin;
		}
		return null;
	};
	
	
	
}
