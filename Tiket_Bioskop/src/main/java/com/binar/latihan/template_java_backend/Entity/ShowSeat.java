package com.binar.latihan.template_java_backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "show_seat")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeat {

    @Id
    int ShowSeatID;
    int Status;
    float Price;
    int CinemaSeatID;
    int ShowID;
    int BookingID;

}
