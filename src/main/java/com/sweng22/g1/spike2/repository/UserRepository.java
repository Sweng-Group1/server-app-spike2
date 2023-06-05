package com.sweng22.g1.spike2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sweng22.g1.spike2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
