package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AdminRepo;
import com.example.demo.Repository.LoanApplicantRepo;
import com.example.demo.Repository.LoginRepo;
import com.example.demo.Repository.UserRepo;
import com.example.demo.model.AdminModel;
import com.example.demo.model.LoanApplicationModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.UserModel;

@Service
public class LoanServices {
	@Autowired
	 public AdminRepo arepo;
	@Autowired
    public LoanApplicantRepo loanrepo;
    @Autowired
    public LoginRepo lrepo;
    @Autowired
    public UserRepo urepo;
    
   //AdminModel
    public AdminModel post1(AdminModel amodel)
    {
   	 return arepo.save(amodel);
    }
    
    public AdminModel get1(String email)
    {
   	 return arepo.findByEmail(email);
    }
    
    public AdminModel put1(AdminModel amodel1)
    {
   	 return arepo.saveAndFlush(amodel1);
    }
    
    public void delete1(String password)
    {
   	 arepo.deleteById(password);
    }
    
    //LoanApplicationModel
    public LoanApplicationModel post2(LoanApplicationModel amodel2)
    {
   	 return loanrepo.save(amodel2);
    }
    
    public List<LoanApplicationModel> get2()
    {
   	 return loanrepo.findAll();
    }
    
    public LoanApplicationModel put2(LoanApplicationModel amodel3)
    {
   	 return loanrepo.saveAndFlush(amodel3);
    }
    
    public void delete2(int loanid)
    {
   	 loanrepo.deleteById(loanid);
    }
    
    //LoginModel
    public String loginCheckData(String email,String password)
 	{
 		LoginModel user = lrepo.findByEmail(email);
 		if(user == null)
 		{
 			return "Invalid User";
 		}
 		else
 		{
 			if(user.getPassword().equals(password))
 			{
 				return "Login Successful";
 			}
 			else
 			{
 				return "Login Failed";
 			}
 		
 		}
 	}
    //UserModel
    
    public UserModel post4(UserModel amodel6)
    {
   	 return urepo.save(amodel6);
    }
    
    public List<UserModel> get4()
    {
   	 return urepo.findAll();
    }
    
    public UserModel put4(UserModel amodel7)
    {
   	 return urepo.saveAndFlush(amodel7);
    }
    
    public void delete4(int id)
    {
   	 urepo.deleteById(id);
    }

}
