package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ChangePassDto;
import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UpdateUser;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:3000")
	public User login(@RequestBody LoginDto loginDto) {
		User loggedInUser = userService.loginUser(loginDto);
		if(loggedInUser == null) {
			return null;
		}
		return loggedInUser;
	}
	
	@PostMapping("/saveUser")
	@CrossOrigin(origins = "http://localhost:3000")
	public String saveUser(@RequestBody UserDto user) {
		
		System.out.println(user.getPassword());
		userService.saveUser(user);
		return "Success"; 
	}
	
	@PostMapping("/updateUser")
	@CrossOrigin(origins = "http://localhost:3000")
	public User updateUser(@RequestBody UpdateUser user) {
		return userService.updateUser(user);
	}
	
	@PostMapping("/changePass")
	@CrossOrigin(origins = "http://localhost:3000")
	public User changepass(@RequestBody ChangePassDto userPass) {
		return userService.changePass(userPass);
	}

}
