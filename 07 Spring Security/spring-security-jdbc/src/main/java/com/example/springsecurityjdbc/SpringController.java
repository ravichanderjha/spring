package com.example.springsecurityjdbc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
@RequestMapping("/userlogin")
public String userValidation() {
return "User: Successfully logged in!";
}

@RequestMapping("/adminlogin")
public String adminValidation() {
return "Admin: Successfully logged in!";
}
}
// URL: http://localhost:8921/sbauth/userlogin