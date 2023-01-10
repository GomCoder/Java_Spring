package com.example.interceptor.controller;

//아무런 권한이 없는 사용자(모두)가 들어올 수 있도록 만든다.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicController {
    @GetMapping("/hello")
    public String hello(){
        return "public hello";
    }

}
