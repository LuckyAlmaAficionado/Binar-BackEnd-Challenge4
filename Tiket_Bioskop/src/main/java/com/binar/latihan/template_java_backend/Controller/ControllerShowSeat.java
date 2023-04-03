package com.binar.latihan.template_java_backend.Controller;

import com.binar.latihan.template_java_backend.Entity.ShowSeat;
import com.binar.latihan.template_java_backend.Service.ServiceShowSeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/showseat")
public class ControllerShowSeat {

    @Autowired
    ServiceShowSeat service;

    /*
        MENGAMBIL DATA SEMUA DAN SESUAI DENGAN BOOKING ID
     */

    @GetMapping("/seat")
    public List<ShowSeat> getAll() {
        return service.getAll();
    }

    @GetMapping("/bookingId/{bookID}")
    public ShowSeat getSeatByBookingId(@PathVariable int bookID) {
        return service.getSeatByBookingID(bookID);
    }


}
