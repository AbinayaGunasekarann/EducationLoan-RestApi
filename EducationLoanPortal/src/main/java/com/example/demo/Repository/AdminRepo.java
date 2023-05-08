package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel,String> {

    AdminModel findByEmail(String email);
}
