package com.blog.dto.auth.request.auth;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto {

    private String username;
    private String password;
    private String email;

}
