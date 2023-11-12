package com.mark.valkanouski.interview.schedular.service;

import com.mark.valkanouski.interview.schedular.dto.UserDto;

public interface UserService {
    public UserDto createUser(UserDto userDto);

    UserDto getUser(Long id);
}
