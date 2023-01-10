package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    //GetMapping의 path 속성 값을 이용하여 주소를 지정할 수 있음
    @GetMapping(path="/hello") // http://localhost:9090/api/get/hello
    public String getHello(){
        return "get hello";
    }

    //@RequestMapping("/hi") //예전에 쓰던 방법, get/post/put/delete 모든 메서드가 동작하게 됨
    @RequestMapping(path = "/hi",method = RequestMethod.GET) //get을 지정 http://localhost:9090/api/get/hi
    public String hi(){
        return "hi";
    }

    //http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name= "id") String pathName){
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    //http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path ="query-param") //데이터의 형태 key= value => Map으로 할 수 있겠구나!
    public String queryParam(@RequestParam  Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> { //람다식 이용
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " +entry.getValue() + "\n");

        });
        return sb.toString();
    }
    //http://localhost:9090/api/get/query-param02?name=steve&email=steve@gmail.com&age=30
    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " " + email + " " + age;
    }

    //http://localhost:9090/api/get/query-param03?name=steve&email=steve@gmail.com&age=30
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}
