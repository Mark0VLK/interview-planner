package com.mark.valkanouski.interview.schedular.service.impl;

import com.mark.valkanouski.interview.schedular.domain.Candidate;
import com.mark.valkanouski.interview.schedular.dto.CandidateDto;
import com.mark.valkanouski.interview.schedular.exeption.ResourceNotFoundException;
import com.mark.valkanouski.interview.schedular.mapper.CandidateMapper;
import com.mark.valkanouski.interview.schedular.repository.CandidateRepository;
import com.mark.valkanouski.interview.schedular.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {
    private final CandidateRepository candidateRepository;
    private final CandidateMapper candidateMapper;

    @Autowired
    public CandidateServiceImpl(CandidateRepository candidateRepository, CandidateMapper candidateMapper) {
        this.candidateRepository = candidateRepository;
        this.candidateMapper = candidateMapper;
    }

    @Override
    public CandidateDto getCandidate(Long id) {
        Optional<Candidate> optionalCandidate = candidateRepository.findById(id);
        Candidate candidate = optionalCandidate.orElseThrow(() -> new ResourceNotFoundException("Candidate not found", HttpStatus.NOT_FOUND));
        return candidateMapper.mapToCandidateDto(candidate);
    }

    @Override
    public CandidateDto createCandidate(CandidateDto candidateDto) {
        Candidate candidate = candidateMapper.mapToCandidate(candidateDto);
        candidate = candidateRepository.save(candidate);
        candidateDto = candidateMapper.mapToCandidateDto(candidate);
        return candidateDto;
    }
}
