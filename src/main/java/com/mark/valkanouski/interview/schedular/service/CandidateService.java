package com.mark.valkanouski.interview.schedular.service;

import com.mark.valkanouski.interview.schedular.dto.CandidateDto;

public interface CandidateService {
    CandidateDto getCandidate(Long id);

    CandidateDto createCandidate(CandidateDto candidateDto);
}
