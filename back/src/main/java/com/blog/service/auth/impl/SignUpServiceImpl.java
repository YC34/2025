package com.blog.service.auth.impl;

import com.blog.dto.auth.request.auth.SignUpRequestDto;
import com.blog.dto.auth.response.SignUpResponseDto;
import com.blog.service.auth.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService {




    // 회원 가입
    @Override
    public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto) {
        try {

        }catch (Exception e){
            log.error("DB ERROR  : {}", e.getMessage(),e);
            return SignUpResponseDto.dbError();
        }

        return SignUpResponseDto.success();
    }
}
