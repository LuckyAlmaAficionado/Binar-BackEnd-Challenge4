package com.binar.demo.service;

import com.binar.demo.model.Seats;
import com.binar.demo.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsService {
    @Autowired
    SeatsRepository repository;
    public List<Seats> getAllSeats() {
        return repository.findAll();
    }
    public Seats inputSeat(Seats seat) {
        return repository.save(seat);
    }
    public List<Seats> inputSeats(List<Seats> seats) {
        return repository.saveAll(seats);
    }
    public Seats updateSeat(Seats seat) {
        Seats update = repository.findById(seat.getSeatNumber()).orElse(null);
        update.setStudioName(seat.getStudioName());
        return repository.save(update);
    }
}
