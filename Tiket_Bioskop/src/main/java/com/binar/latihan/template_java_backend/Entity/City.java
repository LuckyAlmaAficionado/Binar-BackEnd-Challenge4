package com.binar.latihan.template_java_backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "city")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    int cityID;
    String Name;
    String State;
    String Zip_Code;

}
