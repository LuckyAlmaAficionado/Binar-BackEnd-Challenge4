package com.binar.demo.controller;

import com.binar.demo.model.Payment;
import com.binar.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;
    @GetMapping("/all")
    public List<Payment> getAllPayment() {
        return service.getPayment();
    }


}
