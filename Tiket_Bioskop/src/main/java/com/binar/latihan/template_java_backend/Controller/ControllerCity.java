package com.binar.latihan.template_java_backend.Controller;

import com.binar.latihan.template_java_backend.Entity.City;
import com.binar.latihan.template_java_backend.Repository.RepositoryCity;
import com.binar.latihan.template_java_backend.Service.ServiceCity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
@Slf4j
public class ControllerCity {

    @Autowired
    ServiceCity service;

    /*
        POST DATA
     */
    @PostMapping("/add")
    public City addCity(@RequestBody City city) {
        return service.addCity(city);
    }

    /*
        GET DATA
     */

    @GetMapping("/all")
    public List<City> getAllCity() {
        return service.getAllCity();
    }

    @GetMapping("/ByID/{id}")
    public City getByID(@PathVariable int id) {
        return service.getByID(id);
    }

    /*
        UPDATE DATA
     */

    @PutMapping("/update")
    public City updateCity(@PathVariable City city) {
        return service.updateCity(city);
    }

    /*
        DELETE DATA
     */

    @Autowired
    private RepositoryCity repositoryCity;

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        Optional<City> city = repositoryCity.findById(id);
        log.info(String.valueOf(city.isPresent()));
        if (city.isPresent()) {
            repositoryCity.deleteById(id);
            return "id: " + id + " berhasil di hapus";
        } else {
//            throw new RuntimeException("data dengan id: " + id + " tidak ditemukan");
            return "data dengan id: " + id + " tidak ditemukan";
        }
        //        if (city.isEmpty()) {
//            log.info("isPresent");
////            repositoryCity.deleteById(id);
//            return "data berhasil di hapus";
//        } else {
//            log.error("throw");
//            throw new RuntimeException("City not found for the id " + id);
//        }
    }

}