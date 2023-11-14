package com.mark.valkanouski.interview.schedular.mapper;

import com.mark.valkanouski.interview.schedular.domain.Candidate;
import com.mark.valkanouski.interview.schedular.dto.CandidateDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CandidateMapper {
    Candidate mapToCandidate(CandidateDto candidateDto);

    CandidateDto mapToCandidateDto(Candidate candidate);
}
