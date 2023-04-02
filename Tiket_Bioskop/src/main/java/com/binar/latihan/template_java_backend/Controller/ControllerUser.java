package com.binar.latihan.template_java_backend.Controller;

import com.binar.latihan.template_java_backend.Entity.User;
import com.binar.latihan.template_java_backend.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ControllerUser {

    @Autowired
    private ServiceUser service;

    @Value("${app.name}")
    private String appName;

    /*
        MENAMBAHKAN DATA PADA TABLE MOVIE
     */

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }  // bisa

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users) {
        return service.addUsers(users);
    } // bisa

    /*
        MENG-UPDATE DATA BY ID
     */
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    } // bisa


    /*
        MENDAPATKAN DATA MENGENAI USER
     */

    @GetMapping("/getUsers")
    public List<User> getAllUser() {
        return service.getAllUser();
    } // bisa

    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByGenre(@PathVariable String name) {
        return service.getUserByName(name);
    } // bisa


    /*
        MENGHAPUS DATA MENGENAI MOVIE
     */

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteById(id);
    } // berhasil


}
