package com.tns.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.UserService.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be defined here
}
