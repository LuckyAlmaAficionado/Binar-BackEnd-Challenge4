package com.binar.demo.service;

import com.binar.demo.model.Booking;
import com.binar.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepository repository;

    // perkondisian sudah
    public List<Booking> getAllBooking() {
        if (repository.findAll().isEmpty()) throw new RuntimeException("data kosong");
        else return repository.findAll();
    }

    public Optional<Booking> getBooking(int id) {
        if (repository.findById(id).isPresent()) return repository.findById(id);
        else throw new RuntimeException("data dengan id: " + id + " tidak ditemukan");
    }

    public List<Booking> addBooking(List<Booking> booking) {
        return repository.saveAll(booking);
    }

    public Booking updateBooking(Booking booking) {
        if (repository.findById(booking.getBookingId()).isPresent()) {
            Booking update = repository.findById(booking.getBookingId()).orElse(null);
            update.setPayment(booking.getPayment());
            return repository.save(booking);
        } else {
            throw new RuntimeException("data dengan id: " + booking.getBookingId() + " tidak ditemukan");
        }
    }

    public String deleteById(int id) {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return "id: " + id + " berhasil dihapus...!";
        } else {
            return "id: " + id + " tidak ditemukan...!";
        }
    }
}
