package com.blog.dto;

import com.blog.common.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author pyc
 * @since 2025.01.30
 * @descritpion 모든 dto객체가 공통으로 사용하는 dto
 */

@Getter
@AllArgsConstructor
public class ResponseDto {


    private String code;
    private String message;

    // 가능하면, 어노테이션 사용을 지양하고 생성자를 직접 생성하여 작성한다.
    //    public ResponseDto(String code, String message) {
    //        this.code = code;
    //        this.message = message;
    //    }


    // 공통으로 사용할 DB_ERROR
    public static ResponseEntity<ResponseDto> databaseError(){
        ResponseDto dto = new ResponseDto(ResponseCode.DB_ERROR, "DB_오류 입니다. ");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
    }

}
