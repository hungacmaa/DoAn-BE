package com.example.traodoimathangthoitrang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exchange {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    private String status;
    @ManyToOne
    private Post postSell;
    @ManyToOne
    private Post postBuy;
    private Date date = Date.valueOf(LocalDate.now());
}