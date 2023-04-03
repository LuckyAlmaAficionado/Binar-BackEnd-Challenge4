package com.binar.latihan.template_java_backend.Repository;

import com.binar.latihan.template_java_backend.Entity.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryShowSeat extends JpaRepository<ShowSeat, Integer> {

    @Query(value = "SELECT * FROM show_seat WHERE BookingID = :bookingID", nativeQuery = true)
    ShowSeat getByBookingID(
            @Param("bookingID") int bookingID
    );

}
