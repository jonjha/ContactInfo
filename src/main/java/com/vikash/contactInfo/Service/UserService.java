package com.vikash.contactInfo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vikash.contactInfo.entity.UserInfo;
import com.vikash.contactInfo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    UserRepository repository;
	
	public List<UserInfo> getAllUser()
    {
		
		List<UserInfo> users = new ArrayList<UserInfo>();  
		repository.findAll().forEach(user1 -> users.add(user1));  
		return users;  
    }
	
	public void saveOrUpdate(UserInfo user)   
	{  
	
		repository.save(user);
	} 
	
	public UserInfo getUserById(int id)   
	{  
	   return repository.findById(id).get();  
	}  
}
