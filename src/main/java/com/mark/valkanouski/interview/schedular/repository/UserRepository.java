package com.mark.valkanouski.interview.schedular.repository;

import com.mark.valkanouski.interview.schedular.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
