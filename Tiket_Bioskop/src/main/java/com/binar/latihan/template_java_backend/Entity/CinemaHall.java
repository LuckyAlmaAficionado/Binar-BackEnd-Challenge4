package com.binar.latihan.template_java_backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cinema_hall")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class CinemaHall {
    @Id
    int CinemaHallID;
    String Name;
    int TotalSeats;
    int CinemaID;

}
