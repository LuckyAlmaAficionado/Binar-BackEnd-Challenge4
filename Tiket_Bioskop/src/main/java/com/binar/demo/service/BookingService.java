package com.binar.demo.service;

import com.binar.demo.model.Booking;
import com.binar.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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

    LocalDateTime localDateTime = LocalDateTime.now();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Booking updateBooking(Booking booking) {
        Booking update = repository.findById(booking.getBookingId()).orElseThrow(() -> new RuntimeException("data tidak ditemukan"));
        update.setPayment(booking.getPayment());
        return repository.save(booking);
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
