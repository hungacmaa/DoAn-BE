package com.example.traodoimathangthoitrang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentSchedule {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    @Lob
    private String address;
    @OneToOne
    private Exchange exchange;
}

