package com.example.BookJPA.Login;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface LoginRepository extends JpaRepository<Login, Integer> {
	@Query("select l From Login l Where l.tk = ?1 ")
	public Login findLogintk(String tk);
	
	@Query("select l From Login l Where l.tk = ?1 and l.mk = ?2 ")
	public Login findLogin(String tk, String mks);
}
