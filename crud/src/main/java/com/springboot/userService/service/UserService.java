package com.springboot.userService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.userService.entity.UserEntity;
import com.springboot.userService.model.JsonExample;
import com.springboot.userService.model.User;

@Service
public interface UserService {
	
	List<UserEntity> getUsers();
	
	UserEntity getUserById(Integer userEntity);
	
	String deleteUser(Integer id);
	
	UserEntity createUser(UserEntity user)throws Exception;
	
	//UserEntity updateUser(User user);
	
	String jsonData(JsonExample jsonExample);

   public UserEntity updateUser(User user,Integer id);
    


}
