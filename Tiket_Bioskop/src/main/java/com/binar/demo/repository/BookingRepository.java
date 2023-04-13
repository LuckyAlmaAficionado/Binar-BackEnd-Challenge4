package com.binar.demo.repository;

import com.binar.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
