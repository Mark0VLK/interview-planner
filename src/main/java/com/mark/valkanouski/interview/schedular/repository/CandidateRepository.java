package com.mark.valkanouski.interview.schedular.repository;

import com.mark.valkanouski.interview.schedular.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

}
