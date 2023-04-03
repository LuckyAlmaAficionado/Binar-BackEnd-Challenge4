package com.binar.latihan.template_java_backend.Repository;

import com.binar.latihan.template_java_backend.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryCity extends JpaRepository<City, Integer> {


    @Query(value = "SELECT * FROM city WHERE cityID = :cityID", nativeQuery = true)
    City getCityByID(
            @Param("cityID") int cityID
    );

}
