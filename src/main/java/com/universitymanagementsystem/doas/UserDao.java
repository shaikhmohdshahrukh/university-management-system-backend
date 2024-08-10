package com.universitymanagementsystem.doas;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universitymanagementsystem.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	Optional<User> findByUserName(String userName);

}
