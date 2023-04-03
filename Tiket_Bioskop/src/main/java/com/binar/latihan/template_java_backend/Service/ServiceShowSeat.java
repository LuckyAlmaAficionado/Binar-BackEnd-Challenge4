package com.binar.latihan.template_java_backend.Service;

import com.binar.latihan.template_java_backend.Entity.ShowSeat;
import com.binar.latihan.template_java_backend.Repository.RepositoryShowSeat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ServiceShowSeat {

    @Autowired
    private RepositoryShowSeat repo;

    public List<ShowSeat> getAll() {
        return repo.findAll();
    }

    public ShowSeat getSeatByBookingID(int BookingID) {
        Optional<ShowSeat> check = repo.findById(repo.getByBookingID(BookingID).getBookingID());
        if (check.isPresent()) {
            return repo.getByBookingID(BookingID);
        } else {
            throw new RuntimeException("booking id: " + BookingID + " tidak ditemukan");
        }

    }

}
