package com.app.raghu.controller;

import com.app.raghu.dto.AmsUsersDto;
import com.app.raghu.entity.AmsUsers;
import com.app.raghu.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

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
	public String saveData(@ModelAttribute AmsUsersDto users, Model model) {
		System.out.println("Save the page");
		Boolean saveUser = service.saveUser(users); 
		
		System.out.println("data Display " + users.toString());
		
	
		
		if (saveUser) {
			String message = "User Registered....";
			model.addAttribute("message", message);
		}else {
			String message = "User Not Registered....";
			model.addAttribute("message", message);
		}
		return "HomePage";
	}

	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model) {

		// Validate the user
		Boolean isValidUser = service.validateUser(username, password);

		if (isValidUser) {
			// redirect the success screen
			return "success";
		} else {
			// Add an error message to the model and return to the login page
			model.addAttribute("message", "Invalid username or password. Please try again.");
			return "login"; // Return to the login page
		}
	}

//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password, Model model) {
//
//        Boolean flag = service.validateUser(username, password);
//
//        if (flag == true) { // Validate the user
//            return "success";
//        } else {
//            return "login";
//        }
//    }

}
