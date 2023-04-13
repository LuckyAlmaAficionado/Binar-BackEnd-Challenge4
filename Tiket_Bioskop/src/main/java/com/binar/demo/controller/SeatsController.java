package com.binar.demo.controller;

import com.binar.demo.model.Seats;
import com.binar.demo.service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatsController {
    @Autowired
    private SeatsService service;

    @GetMapping("/getseat") // bisa
    public List<Seats> getAllSeats() {
        return service.getAllSeats();
    }

    @PostMapping("/postseat") // bisa
    public Seats postSeat(@RequestBody Seats seat) {
        return service.inputSeat(seat);
    }

    @PostMapping("/postseats") // bisa
    public List<Seats> postSeats(@RequestBody List<Seats> seats) {
        return service.inputSeats(seats);
    }

    @PutMapping("/updateseat") // bisa
    public Seats updateSeat(@RequestBody Seats seat) {
        return service.updateSeat(seat);
    }
}
