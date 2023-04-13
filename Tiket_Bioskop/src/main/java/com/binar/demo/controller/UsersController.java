package com.binar.demo.controller;

import com.binar.demo.model.Users;
import com.binar.demo.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UsersController {
    @Autowired
    private UsersService service;

    @GetMapping("/getusers") // bisa
    public List<Users> getAllUsers() {
        log.info("getAllUsers");
        return service.getAllUsers();
    }

    @GetMapping("/getbyusername") // bisa
    public List<Users> getByUsername(@RequestBody Users name) {
        log.info("getByUsername: " + name.getUsername());
        return service.findByUserName(name.getUsername());
    }

    @PostMapping("/postuser") // bisa
    public Users postUser(@RequestBody Users users) {
        log.info("data masuk");
        return service.postUser(users);
    }

    @PutMapping("/updateuser") // bisa
    public Users updateUser(@RequestBody Users users) {
        log.info("data update");
        return service.updateUser(users);
    }
}
