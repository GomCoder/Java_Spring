package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //html 리소스를 찾음
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    //ReponseEntity로 내려주는 방법이 있고

    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User();
        user.setName("steve");
        user.setAddress("서울시");
        return user;
    }
}
