package com.binar.demo.service;

import com.binar.demo.model.Schedules;
import com.binar.demo.repository.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedulesService {
    @Autowired
    SchedulesRepository repository;

    public boolean isExist(int id) {
        return repository.findById(id).isPresent();
    }

    public List<Schedules> getAllSchedules() {
        return repository.findAll();
    }

    public List<Schedules> postSchedules(List<Schedules> schedules) {
        return repository.saveAll(schedules);
    }

    public Schedules postSchedule(Schedules schedules)  {
        if (!isExist(schedules.getScheduleId())) throw new RuntimeException("jadwal tidak ditemukan");
        return repository.save(schedules);
    }

    public Schedules updateSchedule(Schedules schedules) {
        if (!isExist(schedules.getScheduleId())) throw new RuntimeException("id tidak ditemukan");
        Schedules update = repository.findById(schedules.getScheduleId()).orElse(null);
        update.setDate(schedules.getDate());
        update.setStartTime(schedules.getStartTime());
        update.setEndTime(schedules.getEndTime());
        update.setPrice(schedules.getPrice());
        update.setFilmCode(schedules.getFilmCode());
        return repository.save(schedules);
    }
}
