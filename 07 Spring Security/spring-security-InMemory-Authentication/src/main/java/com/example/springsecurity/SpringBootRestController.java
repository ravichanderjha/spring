package com.example.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9229/springbootwithsecurity/userlogin1
// http://localhost:9229/springbootwithsecurity/adminlogin

@RestController
public class SpringBootRestController {
	@RequestMapping("/userlogin1")
	public String userValidation1() {
		return "User: Successfully logged in 1111!";
	}

	@RequestMapping("/userlogin2")
	public String userValidation2() {
		return "User: Successfully logged in 2222!";
	}

	@RequestMapping("/adminlogin")
	public String adminValidation() {
		return "Admin: Successfully logged in!";
	}

	@RequestMapping("/slrlogin")
	public String slrValidation() {
		return "Seller: Successfully logged in!";
	}
}