package com.binar.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "seats")
@Data
@Entity
public class Seats {
    @Column(name = "studioname")
    String studioName;

    /*
        mengapa id saya taruh di seat number?
        karena pada seatnumber ini memiliki perbedaan
        yang dimana jika kita menaruh ID di colom studio name
        maka jika kita input sesuatu pada table tersebut
        maka itu tidak akan merubah apapun selain update data dengan id yang sama
     */
    @Id
    @Column(name = "seatnumber")
    String seatNumber;
}
