package com.blog.service.auth;


import com.blog.dto.auth.request.auth.SignUpRequestDto;
import com.blog.dto.auth.response.SignUpResponseDto;
import org.springframework.http.ResponseEntity;

public interface SignUpService {
    // 회원 가입
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
}
