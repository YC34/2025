package com.blog.dto.auth.response;

import com.blog.common.ResponseCode;
import com.blog.dto.ResponseDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class SignUpResponseDto extends ResponseDto {
    // TODO 각 서비스 별 ResposeMessage나 code를 달리 보내줘야하는지 고민해야한다.
    // CHECK! Message는 같지만 code는 하나로 통일 된다고 생각한다. ResponseCode만 명세화 하고 msg는 각각에서 명세 해줘야하는건가?

    // 상속받은 객체의 생성자 구현. 상속받은 객체는 접근하지 못하도록  private을 막는다.
    private SignUpResponseDto(String code, String message) {
        super(code, message);
    }
    private static final String signUpMessage = "회원가입 성공";
    private static final String signUpServerError = "회원가입 중 서버 오류";

    // 200
    public static ResponseEntity<SignUpResponseDto> success(){
        SignUpResponseDto dto = new SignUpResponseDto(ResponseCode.SUCCESS, signUpMessage);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }


    // 500
    public static ResponseEntity<SignUpResponseDto> dbError(){
        SignUpResponseDto dto = new SignUpResponseDto(ResponseCode.DB_ERROR,signUpServerError);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
    }



}
