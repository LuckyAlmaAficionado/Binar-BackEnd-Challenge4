package com.binar.demo.repository;

import com.binar.demo.model.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, String> {
}
