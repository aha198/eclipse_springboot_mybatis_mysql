package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.loginUser;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper usermapper;
	public loginUser Sel(int id){
	
	        return usermapper.Sel(id);
	    }
}

