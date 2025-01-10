package com.app.raghu.controller;

import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.raghu.entity.AmsUsers;
import com.app.raghu.service.IService;

@Controller
@RequestMapping("/amc")
public class AmcController {

	@Autowired
	private IService service;

	@GetMapping("/register")
	public String showHomePage() {
		Instant currentTime = Instant.now();
		System.out.println("Register Method called..." + currentTime);
		return "HomePage";
	}

	@PostMapping("/save")
	public String saveData(@ModelAttribute AmsUsers users, Model model) {
		System.out.println("Save the page");
		service.saveUser(users);
		
		System.out.println("data Sisply " +users);
		String message = "User " + "Registered....";
		model.addAttribute("message", message);
		return "HomePage";
	}
	
//	@GetMapping("")
//	public String 
//	
	
	
	
	

}
