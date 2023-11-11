package com.mark.valkanouski.interview.schedular.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mark.valkanouski.interview.schedular.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column(name = "email_id", unique = true, nullable = false)
    private String emailId;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column
    private String password;
    @Column
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    @Column
    private Role role;
    @Column
    private String profileUrl;
    @Column(name = "forget_Token", unique = true)
    private String forgetToken;
    @Column
    private Integer otp;
}
