package com.mark.valkanouski.interview.schedular.service.impl;

import com.mark.valkanouski.interview.schedular.domain.User;
import com.mark.valkanouski.interview.schedular.dto.UserDto;
import com.mark.valkanouski.interview.schedular.exeption.ResourceNotFoundException;
import com.mark.valkanouski.interview.schedular.mapper.UserMapper;
import com.mark.valkanouski.interview.schedular.repository.UserRepository;
import com.mark.valkanouski.interview.schedular.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.mapToUser(userDto);
        User userEntity = userRepository.save(user);
        userDto = userMapper.mapToUserDto(userEntity);
        return userDto;
    }

    @Override
    public UserDto getUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.orElseThrow(() -> new ResourceNotFoundException("Resource not found", HttpStatus.NOT_FOUND));
        return userMapper.mapToUserDto(user);
    }
}