package com.binar.latihan.template_java_backend.Service;

import com.binar.latihan.template_java_backend.Entity.User;
import com.binar.latihan.template_java_backend.Repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUser {

    @Autowired
    private RepositoryUser repository;

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public User addUser(User user) {
        return repository.save(user);
    }

    public List<User> addUsers(List<User> movies) {
        return repository.saveAll(movies);
    }

    public List<User> getUserByName(String genre) {
        return repository.findByName(genre);
    }

    public User updateUser(User user) {
        User update = repository.findById(user.getUserID()).orElse(null);
        update.setName(user.getName());
        update.setEmail(user.getEmail());
        update.setPassword(user.getPassword());
        update.setPhone(user.getPhone());
        return repository.save(update);
    }

    public String deleteById(int id) {
        repository.deleteById(id);
        return "berhasil di hapus...!";
    }

}
