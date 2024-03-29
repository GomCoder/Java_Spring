package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    /*
    @PutMapping("/put")
    public void put(@RequestBody PostRequestDto requestDto){
        System.out.println(requestDto);
    }
    */

    /* 객체를 response 받음
    @PutMapping("/put")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto){
        System.out.println(requestDto);
        return requestDto;
    }
    */

    /*PathVariable*/
    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name="userId") Long Id){
        // @PathVariable Long userId)
        System.out.println(Id);
        return requestDto;
    }


}
