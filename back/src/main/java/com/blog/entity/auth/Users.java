package com.blog.entity.auth;


import lombok.Getter;
import java.sql.Timestamp;

@Getter
public class Users {

    private Integer id;
    private String username;
    private String email;
    private String password;
    private ROLE role;
    private Timestamp createAt;


}
