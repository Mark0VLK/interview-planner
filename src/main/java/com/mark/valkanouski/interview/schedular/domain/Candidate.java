package com.mark.valkanouski.interview.schedular.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @Column(name = "email_id", unique = true, nullable = false)
    private String email;
    private String mobilePhone;
    private Integer ctc;
    private Integer ectc;
    private String location;
    private String notice;
    private String resumeUrl;
}
