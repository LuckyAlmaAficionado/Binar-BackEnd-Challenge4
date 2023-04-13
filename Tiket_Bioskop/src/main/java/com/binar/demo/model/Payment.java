package com.binar.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "payment")
@Data
@Entity
public class Payment {
    @Id
    @Column(name = "paymentid")
    int paymentId;
    int amount;
    @Column(name = "timestamp")
    Date timeStamp;
    @Column(name = "discountcouponid")
    int discountCouponId;
    @Column(name = "paymentmethod")
    String paymentMethod;
    @Column(name = "bookingid")
    int bookingId;
}
