package com.mark.valkanouski.interview.schedular.mapper;

import com.mark.valkanouski.interview.schedular.domain.User;
import com.mark.valkanouski.interview.schedular.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    @Mapping(target = "password", ignore = true)
    UserDto mapToUserDto(User user);
    User mapToUser(UserDto user);
}
