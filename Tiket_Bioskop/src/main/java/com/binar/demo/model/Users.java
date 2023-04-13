package com.binar.demo.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "users")
@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    int userId;
    @Column(name = "username")
    String username;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
}
