package com.mark.valkanouski.interview.schedular.domain;

import com.mark.valkanouski.interview.schedular.enums.InterviewStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "interview")
@Data
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(optional = false)
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;
    @OneToOne(optional = false)
    @JoinColumn(name = "sheduler_id", referencedColumnName = "id")
    private User scheduler;
    @OneToOne(optional = false)
    @JoinColumn(name = "interviewer_id", referencedColumnName = "id")
    private User interviewer;
    private LocalDateTime dateTime;
    @OneToOne(optional = false)
    @JoinColumn(name = "talent_id", referencedColumnName = "id")
    private Talent talent;
    @Enumerated(EnumType.STRING)
    private InterviewStatus interviewStatus;
    private String meetingLink;
}
