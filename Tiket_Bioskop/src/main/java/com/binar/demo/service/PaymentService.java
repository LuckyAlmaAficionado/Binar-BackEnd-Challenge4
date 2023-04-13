package com.binar.demo.service;

import com.binar.demo.model.Payment;
import com.binar.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository repository;
    public List<Payment> getPayment() {
        return repository.findAll();
    }
}
