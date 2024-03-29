package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("--------");
        //Text JSON -> Object
        //Object -> Text JSON

        //controller request json(text) -> object
        //response object -> json(test)

        var objectMapper = new ObjectMapper();

        //object -> text
        //ObjectMapper는 GetMethod를 참조한다.
        var user = new User("steve", 10, "010-1111-2222");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        //text -> object
        //object mapper는 default 생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);

    }
}
