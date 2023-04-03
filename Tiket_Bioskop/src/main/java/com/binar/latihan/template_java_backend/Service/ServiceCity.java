package com.binar.latihan.template_java_backend.Service;

import com.binar.latihan.template_java_backend.Entity.City;
import com.binar.latihan.template_java_backend.Repository.RepositoryCity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ServiceCity {

    @Autowired
    private RepositoryCity repository;

    public List<City> getAllCity() {
        return repository.findAll();
    }

    public City getByID(int id) {
        return repository.getCityByID(id);
    }

    public City updateCity(City city) {
        City update = repository.findById(city.getCityID()).orElse(null);
        update.setName(city.getName());
        update.setState(city.getState());
        update.setZip_Code(city.getZip_Code());
        return repository.save(update);
    }


    public City addCity(City city) {
        return repository.save(city);
    }
}
