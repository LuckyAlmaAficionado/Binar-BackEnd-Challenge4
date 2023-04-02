package com.binar.latihan.template_java_backend.Repository;

import com.binar.latihan.template_java_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositoryUser extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE Name LIKE %:name%", nativeQuery = true)
    List<User> findByName(
            @Param("name") String name
    );
}
