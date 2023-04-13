package com.binar.demo.controller;

import com.binar.demo.model.Booking;
import com.binar.demo.service.BookingService;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
@Slf4j
public class BookingController {
    @Autowired
    private BookingService service;
    @PostMapping("/add")
    public void bookings (@RequestBody List<Booking> bookings){
        log.info("bookings: " + String.valueOf(bookings.size()));
//        return service.addBooking(bookings);
    }
    @GetMapping("/all")
    public List<Booking> getBookingAll() {
        return service.getAllBooking();
    }
    @GetMapping("/id")
    public Optional<Booking> getById(@RequestParam int booking_id) {
        log.info("getById: " + String.valueOf(booking_id));
        return service.getBooking(booking_id);
    }
    @DeleteMapping("/deleteid")
    public String deleteById(@RequestParam int booking_id) {
        log.info("deleteById: " + String.valueOf(booking_id));
        return service.deleteById(booking_id);
    }
}
