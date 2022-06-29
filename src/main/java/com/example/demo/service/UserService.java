package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ChangePassDto;
import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UpdateUser;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	public User loginUser(LoginDto loginDto) {
		String email = loginDto.getEmail();
		System.out.println(email);
		
		User dbUser = userRepository.findByEmail(email);
		
		if(dbUser.getPassword().equals(loginDto.getPassword())) {
			return dbUser;
		}else {
			return null;
		}
		
	}

	public void saveUser(UserDto userDto) {
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		userRepository.save(user);
	}
	
	public User updateUser(UpdateUser user) {
		User updatedUser = userRepository.findByEmail(user.getCurEmail());
		updatedUser.setEmail(user.getEmail());
		updatedUser.setUsername(user.getUsername());
		userRepository.save(updatedUser);
		return updatedUser;
	}
	
	public User changePass(ChangePassDto user) {
		User currentUser = userRepository.findByEmail(user.getEmail());
		if(currentUser == null) {
			return null;
		}
		if(!currentUser.getPassword().equals(user.getCurrPass())) {
			return null;
		}
		currentUser.setPassword(user.getNewPass());
//		updatedUser.setUsername(user.getUsername());
		userRepository.save(currentUser);
		return currentUser;
	}
	
	

}
