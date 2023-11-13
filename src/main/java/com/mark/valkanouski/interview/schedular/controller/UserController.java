package com.mark.valkanouski.interview.schedular.controller;

import com.mark.valkanouski.interview.schedular.dto.ResponseDto;
import com.mark.valkanouski.interview.schedular.dto.UserDto;
import com.mark.valkanouski.interview.schedular.service.UserService;
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

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public HttpEntity<ResponseDto<Object>> getUser(@PathVariable Long id) {
        UserDto userDto = userService.getUser(id);
        return new ResponseEntity<>(ResponseUtil.getSuccessResponse(userDto), HttpStatus.OK);
    }

    @PostMapping
    public HttpEntity<ResponseDto<Object>> createUser(@RequestBody UserDto userDto) {
        userDto = userService.createUser(userDto);
        return new ResponseEntity<>(ResponseUtil.getSuccessResponse(userDto), HttpStatus.OK);
    }
}
