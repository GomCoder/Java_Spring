package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 Class는 REST API를 처리하는 Controller로 동작하게 됨
@RequestMapping("/api") //주소를 매핑하여 할당 RequestMapping은 URI를 지정해 주는 Annotation
public class APIController {
    @GetMapping("/hello") //GET 방식으로 주소 매핑 http://localhost:9090/api/hello
    public String hello() {
        return "hello spring boot!"; //해당 주소로 요청을 하면 문자열을 리턴함
    }
}
