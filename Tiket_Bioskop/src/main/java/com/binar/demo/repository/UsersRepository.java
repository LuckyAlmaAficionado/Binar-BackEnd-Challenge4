package com.binar.demo.repository;

import com.binar.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByUsernameContaining(String name);
}
