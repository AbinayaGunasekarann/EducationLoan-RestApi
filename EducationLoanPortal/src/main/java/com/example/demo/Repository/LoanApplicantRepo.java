package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoanApplicationModel;

public interface LoanApplicantRepo extends JpaRepository<LoanApplicationModel,Integer> {

}
