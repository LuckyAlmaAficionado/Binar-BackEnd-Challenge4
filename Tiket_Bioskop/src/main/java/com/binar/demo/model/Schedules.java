package com.binar.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Table(name = "schedules")
@Data
@Entity
public class Schedules {
    @Id
    @Column(name = "scheduleid")
    int scheduleId;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "filmcode")
//    private Films filmCode;

    @Column(name = "date")
    Date date;
    @Column(name = "starttime")
    Time startTime;
    @Column(name = "endtime")
    Time endTime;
    @Column(name = "price")
    int price;
    @Column(name = "filmcode")
    int filmCode;
}
