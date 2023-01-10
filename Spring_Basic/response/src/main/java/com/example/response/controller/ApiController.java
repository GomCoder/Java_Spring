package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //Text
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    //JSON
    //실제 동작은
    //request를 받으면 -> Object Mapper를 통해 Object로 바뀜 -> Method를 타고 난 다음 Object를 반환
    //-> 반환된 Object는 다시 Object Mapper를 통하여 Json으로 바뀐 후 -> response를 내려주게 됨
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user; //보통 200 ok
    }

    //ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
