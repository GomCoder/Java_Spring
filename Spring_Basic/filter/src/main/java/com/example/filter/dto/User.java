package com.example.filter.dto;


import lombok.*;

/*
@Getter //선언된 변수의 Getter와 Setter를 만들어 줌
@Setter
 */
@Data
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //전체 생성자
public class User {

    private String name;
    private int age;

    //Lombok을 활용
}
