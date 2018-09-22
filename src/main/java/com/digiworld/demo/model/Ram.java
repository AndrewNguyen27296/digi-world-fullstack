package com.digiworld.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ram")
@Getter
@Setter
public class Ram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dung_luong;
    private String don_vi;
    private Boolean an_hien;
}
