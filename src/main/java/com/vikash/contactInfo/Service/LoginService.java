package com.vikash.contactInfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.contactInfo.APIResponse;
import com.vikash.contactInfo.DTO.LoginRequestDTO;
import com.vikash.contactInfo.DTO.SignUpRequestDTO;
import com.vikash.contactInfo.entity.UserInfo;
import com.vikash.contactInfo.repository.UserRepository;
@Service
public class LoginService {
	
	@Autowired
    UserRepository repository;

	public APIResponse signUp(SignUpRequestDTO signUpRequestDTO) {
		// TODO Auto-generated method stub
		APIResponse apiResponse=new APIResponse(); 
		
		UserInfo user=new UserInfo();
		user.setName(signUpRequestDTO.getName());
		user.setEmail(signUpRequestDTO.getName());
		user.setPassword(signUpRequestDTO.getPassword());
		user.setPhone(signUpRequestDTO.getPhone());
		
		user= repository.save(user);
		
		apiResponse.setData(user);
		return apiResponse;
	}

	public APIResponse login(LoginRequestDTO loginRequestDTO) {
		// TODO Auto-generated method stub
		
		APIResponse apiResponse=new APIResponse(); 
		//UserInfo user=repository.findOneByemailIgnoreCaseAndpassword(loginRequestDTO.getEmail(),loginRequestDTO.getPassword());
		UserInfo user=repository.findOneByEmailAndPassword(loginRequestDTO.getEmail(),loginRequestDTO.getPassword());
		if(user==null) {
			apiResponse.setData("login failed");
			
		}else
		{
			apiResponse.setData("logged in");
		}
		
		return apiResponse;
	}

}
