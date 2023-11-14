package com.mark.valkanouski.interview.schedular.controller;

import com.mark.valkanouski.interview.schedular.dto.CandidateDto;
import com.mark.valkanouski.interview.schedular.dto.ResponseDto;
import com.mark.valkanouski.interview.schedular.service.CandidateService;
import com.mark.valkanouski.interview.schedular.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidates")
public class CandidateController {
    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/{id}")
    public HttpEntity<ResponseDto<Object>> getCandidate(@PathVariable Long id) {
        CandidateDto candidateDto = candidateService.getCandidate(id);
        return new ResponseEntity<>(ResponseUtil.getSuccessResponse(candidateDto), HttpStatus.OK);
    }

    @PostMapping
    public HttpEntity<ResponseDto<Object>> createCandidate(@RequestBody CandidateDto candidateDto) {
        candidateDto = candidateService.createCandidate(candidateDto);
        return new ResponseEntity<>(ResponseUtil.getSuccessResponse(candidateDto), HttpStatus.CREATED);
    }
}