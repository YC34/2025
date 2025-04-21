package com.yc89.auth.hello;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.assertj.MockMvcTester;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(controllers = com.yc89.auth.hello.HelloController.class)
@WithMockUser
public class HelloControllerTest {

    @Autowired
    MockMvcTester mockMvcTester;

    // Test의 패키지 구조는   org.junit.jupiter.api를 써야한다.
    @Test
    public void hello(){
        mockMvcTester.get()
                .assertThat()
                .apply(print())
                .bodyText()
                .isEqualTo("Hello World");
    }


}
