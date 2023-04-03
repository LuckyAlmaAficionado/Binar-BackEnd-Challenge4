package com.binar.latihan.template_java_backend.Controller;

import com.binar.latihan.template_java_backend.Entity.CinemaHall;
import com.binar.latihan.template_java_backend.Service.ServiceCinemaHall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cinemaHall")
public class ControllerCinemaHall {

    @Autowired
    private ServiceCinemaHall service;

    @GetMapping("/cinema")
    public List<CinemaHall> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CinemaHall getCinemaById(@PathVariable int id) {
        return service.getById(id);
    }

}
