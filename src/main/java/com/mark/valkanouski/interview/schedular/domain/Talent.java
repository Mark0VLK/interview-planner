package com.mark.valkanouski.interview.schedular.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "talent")
@Data
public class Talent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String requirements;
    private LocalDate startData;
    private LocalDate endData;
    private LocalDate jobLocation;
}
