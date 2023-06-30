package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.UserService;
import com.example.demo.entities.loginUser;
@RestController
@RequestMapping("/testBoot")
public class testController {
	 @Autowired
	    private UserService userService;
	
	  @RequestMapping("/hello")
	    public String hello() {
	        return "Hello Spring Boot!";
	    }
	  @RequestMapping("/getUser")
	    public String GetUser(){
		  System.out.print("到这里了");
		  loginUser user = userService.Sel(0);
		  StringBuilder sb = new StringBuilder();
	        sb.append("ID: ").append(user.getId())
	          .append(", Username: ").append(user.getUsername())
	          .append(", Password: ").append(user.getPassword());
			    return sb.toString();
			
	    }
}



