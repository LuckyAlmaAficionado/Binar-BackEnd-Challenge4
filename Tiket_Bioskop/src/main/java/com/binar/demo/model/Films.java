package com.binar.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "films")
@Data
@Entity
public class Films {
    @Id
    @Column(name = "filmcode")
    int filmCode;
    @Column(name = "filmname")
    String filmName;
    @Column(name = "isshowing")
    Boolean isShowing;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Schedules.class)
    @JoinColumn(name = "filmcode", referencedColumnName = "filmcode", insertable = false, updatable = false)
    List<Schedules> schedules;


}
