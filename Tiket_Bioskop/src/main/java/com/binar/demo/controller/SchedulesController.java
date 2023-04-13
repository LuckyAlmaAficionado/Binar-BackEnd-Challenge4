package com.binar.demo.controller;

import com.binar.demo.model.Schedules;
import com.binar.demo.service.SchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class SchedulesController {
    @Autowired
    private SchedulesService service;

    @GetMapping("/getschedules")
    public List<Schedules> getAllSchedules() {
        return service.getAllSchedules();
    }

    @PostMapping("/postschedule")
    public Schedules addSchedule(@RequestBody Schedules schedules) {
        return service.postSchedule(schedules);
    }

    @PostMapping("/postschedules")
    public List<Schedules> addSchedules(@RequestBody List<Schedules> schedules) {
        return service.postSchedules(schedules);
    }

    @PutMapping("/updateschedule")
    public Schedules updateSchedule(@RequestBody Schedules schedules) {
        return service.updateSchedule(schedules);
    }
}
