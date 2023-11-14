package com.mark.valkanouski.interview.schedular.service;

import com.mark.valkanouski.interview.schedular.dto.UserDto;

public interface UserService {
    UserDto getUser(Long id);

    UserDto createUser(UserDto userDto);
}
