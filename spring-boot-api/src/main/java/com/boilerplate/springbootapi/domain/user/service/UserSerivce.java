package com.boilerplate.springbootapi.domain.user.service;

import com.boilerplate.springbootapi.domain.user.domain.UserEntity;
import com.boilerplate.springbootapi.domain.user.dto.UserDto;
import com.boilerplate.springbootapi.domain.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserSerivce {

    private static final UserRepository userRepository = null;

    public static void add(UserDto.RequestDto requestDto) {

        UserEntity userEntity = UserDto.RequestDto.toEntity(requestDto);

        userRepository.save(userEntity);


    }

}
