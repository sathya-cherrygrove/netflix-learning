package com.userservice.controller;

import com.userservice.com.userservice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<Users, Integer> {


}
