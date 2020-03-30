package com.tpseance4springdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tpseance4springdata.entities.User;
import com.tpseance4springdata.Exceptions.ResourceNotFoundException;
import com.tpseance4springdata.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Qualifier("userRepository")
	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public void saveUser(User theUser) {
		userRepository.save(theUser);
	}

	@Override
	@Transactional
	public User getUser(int id) throws ResourceNotFoundException {
		return userRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException(id));
	}

	@Override
	@Transactional
	public void deleteUser(int theId) {
		userRepository.deleteById(theId);
	}
}





