package com.binar.demo.service;

import com.binar.demo.model.Users;
import com.binar.demo.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    // menambahkan user
    public Users postUser(Users user) {
        if (repository.findById(user.getUserId()).isPresent())
            throw new RuntimeException("data dengan id: " + user.getUserId() + " sudah ada");
        return repository.save(user);
    }

    // mengupdate user
    public Users updateUser(Users users) {
        Users update = repository.findById(users.getUserId()).orElseThrow(() -> new RuntimeException("data tidak ditemukan"));
        update.setEmail(users.getEmail());
        update.setPassword(users.getPassword());
        update.setUsername(users.getUsername());
        return repository.save(update);
    }

    public List<Users> findByUserName(String name) {
        if (repository.findByUsernameContaining(name).isEmpty()) throw new RuntimeException("tidak ada yang cocok");
        return repository.findByUsernameContaining(name);
    }

    public String deleteUser(int id) {
        if (repository.findById(id).isEmpty()) throw new RuntimeException("data dengan id: " + id + " tidak ditemukan");
        repository.deleteById(id);
        return "hapus data dengan id: " + id + " berhasil";
    }
}
