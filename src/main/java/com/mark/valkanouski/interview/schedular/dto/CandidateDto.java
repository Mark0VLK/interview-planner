package com.mark.valkanouski.interview.schedular.dto;

import lombok.Data;

@Data
public class CandidateDto {
    private Long id;
    private String name;
    private String address;
    private String email;
    private String mobilePhone;
    private Integer ctc;
    private Integer ectc;
    private String location;
    private String notice;
    private String resumeUrl;
}
