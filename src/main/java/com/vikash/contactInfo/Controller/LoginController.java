package com.vikash.contactInfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.contactInfo.APIResponse;
import com.vikash.contactInfo.DTO.LoginRequestDTO;
import com.vikash.contactInfo.DTO.SignUpRequestDTO;
import com.vikash.contactInfo.Service.LoginService;

@RestController
public class LoginController {

	@Autowired
    private LoginService loginService;
	
	@PostMapping("/signup")
	public ResponseEntity<APIResponse> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO ){

	    APIResponse apiResponse = loginService.signUp(signUpRequestDTO);

	    return ResponseEntity
	            .status(apiResponse.getStatus())
	            .body(apiResponse);
	}
	
	@PostMapping("/login")
	public ResponseEntity<APIResponse> signUp(@RequestBody LoginRequestDTO loginUpRequestDTO ){

	    APIResponse apiResponse = loginService.login(loginUpRequestDTO);

	    return ResponseEntity
	            .status(apiResponse.getStatus())
	            .body(apiResponse);
	}
}

