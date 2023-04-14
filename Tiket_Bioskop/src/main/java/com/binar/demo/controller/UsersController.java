package com.binar.demo.controller;

import com.binar.demo.model.Users;
import com.binar.demo.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
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
        return service.getAllUsers();
    }

    @GetMapping("/getbyusername") // bisa
    public List<Users> getByUsername(@RequestBody String name) {
        return service.findByUserName(name);
    }

    @PostMapping("/postuser") // bisa
    public Users postUser(@RequestBody Users users) {
        log.info("postUser: " + users);
        return service.postUser(users);
    }

    @PutMapping("/updateuser") // bisa
    public Users updateUser(@RequestBody Users users) {
        log.info("data update " + users);
        return service.updateUser(users);
    }

    @DeleteMapping("/deleteuser")
    public String deleteUser(@RequestBody Users users) {
        return service.deleteUser(users.getUserId());
    }
}
