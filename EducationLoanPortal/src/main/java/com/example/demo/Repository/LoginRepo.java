package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,String>
{
	 LoginModel findByEmail(String email);
}
