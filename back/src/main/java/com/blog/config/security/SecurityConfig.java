package com.blog.config.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.DispatcherServlet;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    // 허용가능한 url명시
    // TODO api 명세나 조회 요청시, token 발급 받아 허용할 수 있도록 수정.
    // TODO swagger(openapi docs)가 path를 설정해 주어도, 기본 index.html로 path가 변경됨 이 부분 설정 필요함.
    private final String [] allowURLs = {"/test/**","/openapi-docs","/v1/json-docs"};

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http, DispatcherServlet dispatcherServlet) throws Exception{
        // api 용 서버이므로, 필요없는 설정들은 disable
        http
                .csrf(CsrfConfigurer::disable)
                .httpBasic(HttpBasicConfigurer::disable)
                .formLogin(FormLoginConfigurer::disable);
        // 허용 가능한 요청과 , 권한에 대한 요청을 설정할 http
        http
                .authorizeHttpRequests(
                        (auth) ->{
                           auth
                                   .requestMatchers(allowURLs).permitAll()
                                   .anyRequest().authenticated();
                        });
        // session 상태를 유지하지 않음.
        http
                .sessionManagement(
                        (session)->{
                   session.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                });

        return http.build();
    }

    // TODO CORS config 설정 해야함.

}
