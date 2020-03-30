package com.tpseance4springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpseance4springdata.entities.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

}
