package com.blog.common;

public interface ResponseCode {
    /**
     * @author pyc
     * @since 2025.01.27.
     * @description
     * spring boot의 Response객체의 response dto가 상속받을  static한 code
      */


    // common code 200
    String SUCCESS = "SU";



    // common code 500
    // DB error
    String DB_ERROR = "DBE";
}
