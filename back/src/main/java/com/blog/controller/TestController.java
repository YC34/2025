package com.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
@Slf4j
public class TestController {

    // GET 요청 처리
    @GetMapping
    public ResponseEntity<String> GetTest() {
        return ResponseEntity.ok("Http Get!");  // 상태 코드 200을 간단히 반환
    }

    // POST 요청 처리 (리소스 생성)
    @PostMapping
    public ResponseEntity<Map<String, String>> PostTest() {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("message", "Http Post! Resource created.");

        // 201 Created 상태 코드 반환
        return ResponseEntity.status(201).body(responseMap);
    }

    // PUT 요청 처리 (리소스 전체 업데이트)
    @PutMapping
    public ResponseEntity<Map<String, String>> PutTest() {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("message", "Http Put! Resource updated completely.");

        // 200 OK 상태 코드 반환
        return ResponseEntity.ok(responseMap);
    }

    // PATCH 요청 처리 (리소스 부분 업데이트)
    @PatchMapping
    public ResponseEntity<Map<String, String>> PatchTest() {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("message", "Http Patch! Resource partially updated.");

        // 200 OK 상태 코드 반환
        return ResponseEntity.ok(responseMap);
    }

    // DELETE 요청 처리 (리소스 삭제)
    @DeleteMapping
    public ResponseEntity<Map<String, String>> DeleteTest() {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("message", "Http Delete! Resource deleted.");

        // 200 OK 상태 코드 반환
        return ResponseEntity.ok(responseMap);
    }
}
