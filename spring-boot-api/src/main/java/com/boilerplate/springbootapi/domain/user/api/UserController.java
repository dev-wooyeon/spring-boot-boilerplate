package com.boilerplate.springbootapi.domain.user.api;

import com.boilerplate.springbootapi.domain.user.dto.UserDto;
import com.boilerplate.springbootapi.domain.user.service.UserSerivce;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/v1/add/user")
    public String addUser(@RequestBody UserDto.RequestDto requestDto) throws Exception {

        // 유효성 검사 (사실 아래와 같은 에러는 RequestDto에서 유효성 처리하는 것이 일반적)
        if (requestDto.getName().length() >= 20) {
            throw new Exception("전달 주신 이름의 길이가 20글자가 넘어요!");
        }
        // 서비스 호출
        UserSerivce.add(requestDto);


        // 응답 객체 설정
        return "등록 성공!";
    }
}
