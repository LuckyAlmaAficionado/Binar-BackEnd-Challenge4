package com.binar.demo.repository;

import com.binar.demo.model.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulesRepository extends JpaRepository<Schedules, Integer> {
}
