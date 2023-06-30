package com.example.demo.mapper;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.loginUser;
@Repository
public interface UserMapper {
	loginUser Sel(int id);
}
