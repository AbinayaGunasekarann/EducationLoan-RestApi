package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.LoanServices;
import com.example.demo.model.AdminModel;
import com.example.demo.model.LoanApplicationModel;
import com.example.demo.model.UserModel;

@RestController
public class LoanController {
	@Autowired
	  public LoanServices lser;
	  
		//AdminModel
		@PostMapping("/post1")
		public AdminModel postD(@RequestBody AdminModel amodel)
		{
			return lser.post1(amodel);
		}
		@GetMapping("/get1/{email}")
		public AdminModel getD(@PathVariable String email)
		{
			return lser.get1(email);
		}
		@PutMapping("/put1")
		public AdminModel putD(@RequestBody AdminModel amodel1)
		{
			return lser.put1(amodel1);
		}
		
		//LoanApplicationModel
		
		@PostMapping("/post2")
		public LoanApplicationModel postD1(@RequestBody LoanApplicationModel amodel3)
		{
			return lser.post2(amodel3);
		}
		@GetMapping("/get2")
		public List<LoanApplicationModel> getD1()
		{
			return lser.get2();
		}
		@PutMapping("/put2")
		public LoanApplicationModel putD1(@RequestBody LoanApplicationModel amodel4)
		{
			return lser.put2(amodel4);
		}
		@DeleteMapping("/del2/{cid}")
		public String deleteD1(@PathVariable("cid") int loanid)
		{
			lser.delete2(loanid);
			return "Deleted";
		}
		
		//LoginModel
		@PostMapping("/login")
		public String login(@RequestBody Map<String,String> loginDataMap)
				{
					String email = loginDataMap.get("email");
					String password = loginDataMap.get("password");
					return lser.loginCheckData(email, password);
				}
		//UserModel
		@PostMapping("/post4")
		public UserModel postD3(UserModel amodel7)
		{
			return lser.post4(amodel7);
		}
		@GetMapping("/get4")
		public List<UserModel> getD3()
		{
			return lser.get4();
		}
		@PutMapping("/put4")
		public UserModel putD3(UserModel amodel8)
		{
			return lser.put4(amodel8);
		}
		@DeleteMapping("/del4/{aid}")
		public String deleteD3(@PathVariable("aid") int id)
		{
			lser.delete4(id);
			return "Deleted";
		}

}
