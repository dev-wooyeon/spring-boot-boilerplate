package com.boilerplate.springbootapi.domain.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.boilerplate.springbootapi.domain.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

public class UserDto {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class RequestDto {
        @JsonProperty("name")
        private String name;
        @JsonProperty("age")
        private Integer age;
        @JsonProperty("gender")
        private Character gender;

        public static UserEntity toEntity(RequestDto requestDto) {
            return UserEntity.builder()
                    .name(requestDto.getName())
                    .age(requestDto.getAge())
                    .gender(requestDto.getGender())
                    .build();
        }
    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class ResponseDto {
        @JsonProperty("name")
        private String name;
        @JsonProperty("age")
        private String age;
        @JsonProperty("gender")
        private String gender;
    }


}
