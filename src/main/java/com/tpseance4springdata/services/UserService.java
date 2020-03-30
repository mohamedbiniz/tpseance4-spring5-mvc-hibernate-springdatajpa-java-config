package com.tpseance4springdata.services;

import java.util.List;

import com.tpseance4springdata.entities.User;
import com.tpseance4springdata.Exceptions.ResourceNotFoundException;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(User theUser);

	public User getUser(int theId) throws ResourceNotFoundException;

	public void deleteUser(int theId) throws ResourceNotFoundException;
	
}
