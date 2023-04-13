package com.binar.demo.service;

import com.binar.demo.model.Users;
import com.binar.demo.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
public class UsersService {
    @Autowired
    UsersRepository repository;

    public List<Users> getAllUsers() {
        if (repository.findAll().isEmpty()) throw new RuntimeException("tidak ada data yang ditemukan...!");
        return repository.findAll();
    }

    public Users postUser(Users user) {
        if (repository.findById(user.getUserId()).isPresent()) throw new RuntimeException("data dengan id: " + user.getUserId() + " sudah ada");
        return repository.save(user);
    }

    public Users updateUser(Users users) {
        if (repository.findById(users.getUserId()).isPresent()) {
            Users update = repository.findById(users.getUserId()).orElse(null);
            update.setEmail(users.getEmail());
            update.setPassword(users.getPassword());
            update.setUsername(users.getUsername());
            return repository.save(update);
        }
        throw new RuntimeException("data dengan id: " + users.getUserId() + " tidak ditemukan");
    }

    public List<Users> findByUserName(String name) {
        if (repository.findByUsernameContaining(name).isEmpty()) throw new RuntimeException("tidak ada yang cocok");
        return repository.findByUsernameContaining(name);
    }
}
