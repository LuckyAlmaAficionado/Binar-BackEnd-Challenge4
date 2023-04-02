package com.binar.latihan.template_java_backend.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    int UserID;
    String Name;
    String Password;
    String Email;
    String Phone;
}
