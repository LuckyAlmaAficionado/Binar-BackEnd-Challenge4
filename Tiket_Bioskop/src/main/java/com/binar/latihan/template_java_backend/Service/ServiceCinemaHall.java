package com.binar.latihan.template_java_backend.Service;

import com.binar.latihan.template_java_backend.Entity.CinemaHall;
import com.binar.latihan.template_java_backend.Repository.RepositoryCinemaHall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCinemaHall {
    @Autowired
    private RepositoryCinemaHall repo;

    public List<CinemaHall> getAll() {
        return repo.findAll();
    }

    public CinemaHall getById(int id) {
        Optional<CinemaHall> check = repo.findById(id);
        if (check.isPresent()) {
            return repo.getReferenceById(id);
        } else {
            throw new RuntimeException("id tidak ditemukan");
        }
    }

}


