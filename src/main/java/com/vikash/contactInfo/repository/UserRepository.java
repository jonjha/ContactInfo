package com.vikash.contactInfo.repository;

import org.springframework.data.repository.CrudRepository;

import com.vikash.contactInfo.entity.UserInfo;

public interface UserRepository  extends CrudRepository<UserInfo, Integer> {


	//UserInfo findOneByemailIgnoreCaseAndpassword(String email, String password);

	//UserInfo findOneByemailAndpassword(String email, String password);

	//UserInfo findOneByemailandpassword(String email, String password);

	UserInfo findOneByEmailAndPassword(String email, String password);
 
}


  