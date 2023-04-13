package com.binar.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Table(name = "booking")
@Data
@Entity
public class Booking {
    @Id
    @Column(name = "bookingid")
    int bookingId;
    @Column(name = "userid")
    int userId;
    @Column(name = "seat")
    String seat;
    @Column(name = "payment")
    String payment;
    @Column(name = "lastupdate")
    Date lastUpdate;
    @Column(name = "filmcode")
    String filmCode;
}
