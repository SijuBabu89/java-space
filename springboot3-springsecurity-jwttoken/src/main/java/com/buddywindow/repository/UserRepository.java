package com.buddywindow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buddywindow.entity.User;
import com.buddywindow.entity.UserInfo;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

}
