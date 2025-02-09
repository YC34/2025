package com.blog.controller.auth;


import com.blog.dto.auth.request.auth.SignUpRequestDto;
import com.blog.dto.auth.response.SignUpResponseDto;
import com.blog.service.auth.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pyc
 * @since 2025.01.29
 * @description 회원가입, 로그인, 로그아웃, 토큰 발급 등 security에 관한 contorller
 */

@RestController
@RequestMapping("/v1/api/auth")
@Slf4j
public class AuthController {

    @Autowired
    private final SignUpService signUpService;

    public AuthController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }


    /**
     * @author pyc
     * @since 2025.01.29.
     *
     * @param user info(자세한 내용은 문서 참조)
     * @return response code
      */



    @PostMapping("/sign-up")
    public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto){


        // test log
        log.info("email : {}" , dto.getEmail());
        ResponseEntity<? super SignUpResponseDto> response = signUpService.signUp(dto);
        return response;
    }



}
