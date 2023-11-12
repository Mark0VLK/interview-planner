package com.mark.valkanouski.interview.schedular.dto;

import com.mark.valkanouski.interview.schedular.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String address;
    private String emailId;
    private String password;
    private String phoneNumber;
    private Role role;
    private String profileUrl;
    private String forgetToken;
    private Integer otp;
}
