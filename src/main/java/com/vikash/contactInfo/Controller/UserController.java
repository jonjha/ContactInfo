package com.vikash.contactInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.contactInfo.Service.UserService;
import com.vikash.contactInfo.entity.UserInfo;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")  
	private List<UserInfo> getAllUser()   
	{  
	return userService.getAllUser();  
	} 
	
	@PostMapping("/users")  
	private void saveUser(@RequestBody UserInfo user)   
	{  
		userService.saveOrUpdate(user);  
	 
	}
	
	@GetMapping("/users/{userId}")  
	private UserInfo getUser(@PathVariable("userId") int userId)   
	{  
	return userService.getUserById(userId);  
	} 

}
