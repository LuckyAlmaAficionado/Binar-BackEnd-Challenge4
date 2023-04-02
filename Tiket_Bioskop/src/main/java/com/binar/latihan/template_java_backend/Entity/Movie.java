package com.binar.latihan.template_java_backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "movie")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    int MovieID;
    String Title;
    @Column(name = "Description")
    String Description;
    @Column(name = "Duration")
    Time Duration;
    @Column(name = "Language")
    String Language;
    @Column(name = "Release_Date")
    String Release_Date;
    @Column(name = "Country")
    String Country;
    @Column(name = "Genre")
    String Genre;
}
