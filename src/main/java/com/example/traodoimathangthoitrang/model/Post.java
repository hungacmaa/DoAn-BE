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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "`title`")
    private String title;
    private String category;
    @Column(name = "`describe`")
    private String describe;
    @Column(name = "`request`")
    private String request;
    private String address;
    private Date date = Date.valueOf(LocalDate.now());
    private String status; // trạng thái đọc hoặc chưa
    @ManyToOne
    private Account account; // người gửi
    @OneToMany
    private List<Image> imageList;
    private int countLike;
}
